// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the security settings like secure boot and vTPM used while creating the virtual machine. <br><br>Minimum api-version: 2020-12-01
 * 
 */
public final class UefiSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final UefiSettingsResponse Empty = new UefiSettingsResponse();

    /**
     * Specifies whether secure boot should be enabled on the virtual machine. <br><br>Minimum api-version: 2020-12-01
     * 
     */
    @Import(name="secureBootEnabled")
      private final @Nullable Boolean secureBootEnabled;

    public Optional<Boolean> secureBootEnabled() {
        return this.secureBootEnabled == null ? Optional.empty() : Optional.ofNullable(this.secureBootEnabled);
    }

    /**
     * Specifies whether vTPM should be enabled on the virtual machine. <br><br>Minimum api-version: 2020-12-01
     * 
     */
    @Import(name="vTpmEnabled")
      private final @Nullable Boolean vTpmEnabled;

    public Optional<Boolean> vTpmEnabled() {
        return this.vTpmEnabled == null ? Optional.empty() : Optional.ofNullable(this.vTpmEnabled);
    }

    public UefiSettingsResponse(
        @Nullable Boolean secureBootEnabled,
        @Nullable Boolean vTpmEnabled) {
        this.secureBootEnabled = secureBootEnabled;
        this.vTpmEnabled = vTpmEnabled;
    }

    private UefiSettingsResponse() {
        this.secureBootEnabled = null;
        this.vTpmEnabled = null;
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
