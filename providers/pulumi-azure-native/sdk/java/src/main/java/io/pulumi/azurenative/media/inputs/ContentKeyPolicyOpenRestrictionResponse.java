// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an open restriction. License or key will be delivered on every request.
 * 
 */
public final class ContentKeyPolicyOpenRestrictionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyOpenRestrictionResponse Empty = new ContentKeyPolicyOpenRestrictionResponse();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyOpenRestriction'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    public ContentKeyPolicyOpenRestrictionResponse(String odataType) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyOpenRestrictionResponse() {
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyOpenRestrictionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyOpenRestrictionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public ContentKeyPolicyOpenRestrictionResponse build() {
            return new ContentKeyPolicyOpenRestrictionResponse(odataType);
        }
    }
}
