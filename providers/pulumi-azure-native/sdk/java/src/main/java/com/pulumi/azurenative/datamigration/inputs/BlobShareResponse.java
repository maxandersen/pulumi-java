// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Blob container storage information.
 * 
 */
public final class BlobShareResponse extends com.pulumi.resources.InvokeArgs {

    public static final BlobShareResponse Empty = new BlobShareResponse();

    /**
     * SAS URI of Azure Storage Account Container.
     * 
     */
    @Import(name="sasUri", required=true)
    private String sasUri;

    public String sasUri() {
        return this.sasUri;
    }

    private BlobShareResponse() {}

    private BlobShareResponse(BlobShareResponse $) {
        this.sasUri = $.sasUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobShareResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobShareResponse $;

        public Builder() {
            $ = new BlobShareResponse();
        }

        public Builder(BlobShareResponse defaults) {
            $ = new BlobShareResponse(Objects.requireNonNull(defaults));
        }

        public Builder sasUri(String sasUri) {
            $.sasUri = sasUri;
            return this;
        }

        public BlobShareResponse build() {
            $.sasUri = Objects.requireNonNull($.sasUri, "expected parameter 'sasUri' to be non-null");
            return $;
        }
    }

}
