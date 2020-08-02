package andrei;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        int extraBucketsNeeded = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {

            return -1;
        }

        double area = width * height;
        double totalBucketsNeeded = Math.ceil(area / areaPerBucket);
        return extraBucketsNeeded = (int) (totalBucketsNeeded - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        int totalBucketsNeeded = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {

            return -1;
        }
        double area = width * height;
        return totalBucketsNeeded = (int) Math.ceil(area / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        int totalBucketsNeeded = 0;

        if (area <= 0 || areaPerBucket <= 0) {

            return -1;
        }
        return totalBucketsNeeded = (int) Math.ceil(area / areaPerBucket);
    }
}
