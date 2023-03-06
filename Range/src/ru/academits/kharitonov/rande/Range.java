package ru.academits.kharitonov.rande;


public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return from <= number && to >= number;
    }

    public Range getIntersection(Range range) {
        if (from <= range.from && range.from < to && to < range.to) {
            return new Range(range.from, to);
        } else if (from <= range.from && to >= range.to) {
            return new Range(range.from, range.to);
        } else if (from > range.from && to >= range.to) {
            return new Range(from, range.to);
        }

        return null;
    }

    @Override
    public String toString() {
        return String.format("(from=%.1f, to=%.1f)", from, to);
    }

    public Range[] getUnion(Range range) {
        if (from <= range.from && to < range.to) {
            return new Range[]{new Range(from, range.to)};
        } else if (from < range.from && to < range.from) {
            return new Range[]{new Range(from, to), new Range(range.from, range.to)};
        } else if (from <= range.from && to >= range.to) {
            return new Range[]{new Range(from, to)};
        } else if (from >= range.from && to > range.to) {
            return new Range[]{new Range(range.from, to)};
        } else if (from >= range.from && to <= range.to) {
            return new Range[]{new Range(range.from, range.to)};
        }

        return new Range[]{new Range(range.from, range.to), new Range(from, to)};
    }

    public Range[] getDifference(Range range) {
        if (from < to && to < range.from) {
            return new Range[]{new Range(from, to)};
        } else if (from < range.from && to > range.from && to < range.to) {
            return new Range[]{new Range(from, range.from)};
        } else if (from < range.from && to > range.to) {
            return new Range[]{new Range(from, range.from), new Range(range.to, to)};
        } else if (from > range.from && from < range.to && to > range.to) {
            return new Range[]{new Range(range.to, to)};
        } else if (from > range.to) {
            return new Range[]{new Range(from, to)};
        }

        return null;
    }
}