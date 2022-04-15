// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.BlobRestoreRangeResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BlobRestoreParametersResponse {
    /**
     * Blob ranges to restore.
     * 
     */
    private final List<BlobRestoreRangeResponse> blobRanges;
    /**
     * Restore blob to the specified time.
     * 
     */
    private final String timeToRestore;

    @CustomType.Constructor
    private BlobRestoreParametersResponse(
        @CustomType.Parameter("blobRanges") List<BlobRestoreRangeResponse> blobRanges,
        @CustomType.Parameter("timeToRestore") String timeToRestore) {
        this.blobRanges = blobRanges;
        this.timeToRestore = timeToRestore;
    }

    /**
     * Blob ranges to restore.
     * 
    */
    public List<BlobRestoreRangeResponse> blobRanges() {
        return this.blobRanges;
    }
    /**
     * Restore blob to the specified time.
     * 
    */
    public String timeToRestore() {
        return this.timeToRestore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobRestoreParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BlobRestoreRangeResponse> blobRanges;
        private String timeToRestore;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobRestoreParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobRanges = defaults.blobRanges;
    	      this.timeToRestore = defaults.timeToRestore;
        }

        public Builder blobRanges(List<BlobRestoreRangeResponse> blobRanges) {
            this.blobRanges = Objects.requireNonNull(blobRanges);
            return this;
        }
        public Builder blobRanges(BlobRestoreRangeResponse... blobRanges) {
            return blobRanges(List.of(blobRanges));
        }
        public Builder timeToRestore(String timeToRestore) {
            this.timeToRestore = Objects.requireNonNull(timeToRestore);
            return this;
        }        public BlobRestoreParametersResponse build() {
            return new BlobRestoreParametersResponse(blobRanges, timeToRestore);
        }
    }
}
