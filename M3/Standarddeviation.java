    public double getAverage() {
        if (dataSize == 0) {
            return 0;
        } else {
            return sum / dataSize;
        }
    }

    // (a) Method to calculate standard deviation
    public double getStandardDeviation() {
        if (dataSize == 0) {
            return 0;
        }
        double mean = getAverage();
        double sumSquaredDiffs = 0;
        for (int i = 0; i < dataSize; i++) {
            sumSquaredDiffs += Math.pow(data[i] - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / dataSize);
    }

    // Assume toString method exists
    @Override
    public String toString() {
        return "DataSet{size=" + dataSize + ", average=" + getAverage() + ", stdDev=" + getStandardDeviation() + "}";
    }

    // (b) Static method to calculate the average of DataSet objects
    public static double calculateAverage(DataSet[] dataSets) {
        double totalSum = 0;
        for (DataSet ds : dataSets) {
            totalSum += ds.getAverage();
        }
        return totalSum / dataSets.length;
    }
}
