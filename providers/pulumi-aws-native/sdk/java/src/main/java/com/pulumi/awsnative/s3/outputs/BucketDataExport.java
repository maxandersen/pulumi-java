// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.outputs;

import com.pulumi.awsnative.s3.outputs.BucketDestination;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketDataExport {
    private final BucketDestination destination;
    /**
     * The version of the output schema to use when exporting data.
     * 
     */
    private final String outputSchemaVersion;

    @CustomType.Constructor
    private BucketDataExport(
        @CustomType.Parameter("destination") BucketDestination destination,
        @CustomType.Parameter("outputSchemaVersion") String outputSchemaVersion) {
        this.destination = destination;
        this.outputSchemaVersion = outputSchemaVersion;
    }

    public BucketDestination destination() {
        return this.destination;
    }
    /**
     * The version of the output schema to use when exporting data.
     * 
    */
    public String outputSchemaVersion() {
        return this.outputSchemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketDataExport defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketDestination destination;
        private String outputSchemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketDataExport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.outputSchemaVersion = defaults.outputSchemaVersion;
        }

        public Builder destination(BucketDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder outputSchemaVersion(String outputSchemaVersion) {
            this.outputSchemaVersion = Objects.requireNonNull(outputSchemaVersion);
            return this;
        }        public BucketDataExport build() {
            return new BucketDataExport(destination, outputSchemaVersion);
        }
    }
}
