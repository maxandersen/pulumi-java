// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BlobShareResponse {
    /**
     * @return SAS URI of Azure Storage Account Container.
     * 
     */
    private final String sasUri;

    @CustomType.Constructor
    private BlobShareResponse(@CustomType.Parameter("sasUri") String sasUri) {
        this.sasUri = sasUri;
    }

    /**
     * @return SAS URI of Azure Storage Account Container.
     * 
     */
    public String sasUri() {
        return this.sasUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobShareResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sasUri;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobShareResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUri = defaults.sasUri;
        }

        public Builder sasUri(String sasUri) {
            this.sasUri = Objects.requireNonNull(sasUri);
            return this;
        }        public BlobShareResponse build() {
            return new BlobShareResponse(sasUri);
        }
    }
}
