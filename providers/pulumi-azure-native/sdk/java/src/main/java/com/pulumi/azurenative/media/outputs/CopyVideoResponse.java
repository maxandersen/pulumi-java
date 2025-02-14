// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CopyVideoResponse {
    /**
     * @return An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    private final @Nullable String label;
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.CopyVideo&#39;.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private CopyVideoResponse(
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("odataType") String odataType) {
        this.label = label;
        this.odataType = odataType;
    }

    /**
     * @return An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.CopyVideo&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyVideoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String label;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyVideoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
        }

        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public CopyVideoResponse build() {
            return new CopyVideoResponse(label, odataType);
        }
    }
}
