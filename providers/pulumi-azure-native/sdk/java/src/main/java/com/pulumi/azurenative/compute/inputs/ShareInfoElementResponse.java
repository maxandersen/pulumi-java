// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ShareInfoElementResponse extends com.pulumi.resources.InvokeArgs {

    public static final ShareInfoElementResponse Empty = new ShareInfoElementResponse();

    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     * 
     */
    @Import(name="vmUri", required=true)
      private final String vmUri;

    public String vmUri() {
        return this.vmUri;
    }

    public ShareInfoElementResponse(String vmUri) {
        this.vmUri = Objects.requireNonNull(vmUri, "expected parameter 'vmUri' to be non-null");
    }

    private ShareInfoElementResponse() {
        this.vmUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareInfoElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vmUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareInfoElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmUri = defaults.vmUri;
        }

        public Builder vmUri(String vmUri) {
            this.vmUri = Objects.requireNonNull(vmUri);
            return this;
        }        public ShareInfoElementResponse build() {
            return new ShareInfoElementResponse(vmUri);
        }
    }
}
