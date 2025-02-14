// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UefiSettingsResponse {
    /**
     * @return Specifies whether secure boot should be enabled on the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01
     * 
     */
    private final @Nullable Boolean secureBootEnabled;
    /**
     * @return Specifies whether vTPM should be enabled on the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01
     * 
     */
    private final @Nullable Boolean vTpmEnabled;

    @CustomType.Constructor
    private UefiSettingsResponse(
        @CustomType.Parameter("secureBootEnabled") @Nullable Boolean secureBootEnabled,
        @CustomType.Parameter("vTpmEnabled") @Nullable Boolean vTpmEnabled) {
        this.secureBootEnabled = secureBootEnabled;
        this.vTpmEnabled = vTpmEnabled;
    }

    /**
     * @return Specifies whether secure boot should be enabled on the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01
     * 
     */
    public Optional<Boolean> secureBootEnabled() {
        return Optional.ofNullable(this.secureBootEnabled);
    }
    /**
     * @return Specifies whether vTPM should be enabled on the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01
     * 
     */
    public Optional<Boolean> vTpmEnabled() {
        return Optional.ofNullable(this.vTpmEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UefiSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean secureBootEnabled;
        private @Nullable Boolean vTpmEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(UefiSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secureBootEnabled = defaults.secureBootEnabled;
    	      this.vTpmEnabled = defaults.vTpmEnabled;
        }

        public Builder secureBootEnabled(@Nullable Boolean secureBootEnabled) {
            this.secureBootEnabled = secureBootEnabled;
            return this;
        }
        public Builder vTpmEnabled(@Nullable Boolean vTpmEnabled) {
            this.vTpmEnabled = vTpmEnabled;
            return this;
        }        public UefiSettingsResponse build() {
            return new UefiSettingsResponse(secureBootEnabled, vTpmEnabled);
        }
    }
}
