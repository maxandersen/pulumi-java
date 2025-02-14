// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HlsSettingsResponse {
    /**
     * @return The characteristics for the HLS setting.
     * 
     */
    private final @Nullable String characteristics;
    /**
     * @return The default for the HLS setting.
     * 
     */
    private final @Nullable Boolean default_;
    /**
     * @return The forced for the HLS setting.
     * 
     */
    private final @Nullable Boolean forced;

    @CustomType.Constructor
    private HlsSettingsResponse(
        @CustomType.Parameter("characteristics") @Nullable String characteristics,
        @CustomType.Parameter("default") @Nullable Boolean default_,
        @CustomType.Parameter("forced") @Nullable Boolean forced) {
        this.characteristics = characteristics;
        this.default_ = default_;
        this.forced = forced;
    }

    /**
     * @return The characteristics for the HLS setting.
     * 
     */
    public Optional<String> characteristics() {
        return Optional.ofNullable(this.characteristics);
    }
    /**
     * @return The default for the HLS setting.
     * 
     */
    public Optional<Boolean> default_() {
        return Optional.ofNullable(this.default_);
    }
    /**
     * @return The forced for the HLS setting.
     * 
     */
    public Optional<Boolean> forced() {
        return Optional.ofNullable(this.forced);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HlsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String characteristics;
        private @Nullable Boolean default_;
        private @Nullable Boolean forced;

        public Builder() {
    	      // Empty
        }

        public Builder(HlsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characteristics = defaults.characteristics;
    	      this.default_ = defaults.default_;
    	      this.forced = defaults.forced;
        }

        public Builder characteristics(@Nullable String characteristics) {
            this.characteristics = characteristics;
            return this;
        }
        public Builder default_(@Nullable Boolean default_) {
            this.default_ = default_;
            return this;
        }
        public Builder forced(@Nullable Boolean forced) {
            this.forced = forced;
            return this;
        }        public HlsSettingsResponse build() {
            return new HlsSettingsResponse(characteristics, default_, forced);
        }
    }
}
