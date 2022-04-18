// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomImagePropertiesCustomResponse {
    /**
     * The image name.
     * 
     */
    private final @Nullable String imageName;
    /**
     * The OS type of the custom image (i.e. Windows, Linux)
     * 
     */
    private final String osType;
    /**
     * Indicates whether sysprep has been run on the VHD.
     * 
     */
    private final @Nullable Boolean sysPrep;

    @CustomType.Constructor
    private CustomImagePropertiesCustomResponse(
        @CustomType.Parameter("imageName") @Nullable String imageName,
        @CustomType.Parameter("osType") String osType,
        @CustomType.Parameter("sysPrep") @Nullable Boolean sysPrep) {
        this.imageName = imageName;
        this.osType = osType;
        this.sysPrep = sysPrep;
    }

    /**
     * The image name.
     * 
    */
    public Optional<String> imageName() {
        return Optional.ofNullable(this.imageName);
    }
    /**
     * The OS type of the custom image (i.e. Windows, Linux)
     * 
    */
    public String osType() {
        return this.osType;
    }
    /**
     * Indicates whether sysprep has been run on the VHD.
     * 
    */
    public Optional<Boolean> sysPrep() {
        return Optional.ofNullable(this.sysPrep);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesCustomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String imageName;
        private String osType;
        private @Nullable Boolean sysPrep;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesCustomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.osType = defaults.osType;
    	      this.sysPrep = defaults.sysPrep;
        }

        public Builder imageName(@Nullable String imageName) {
            this.imageName = imageName;
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder sysPrep(@Nullable Boolean sysPrep) {
            this.sysPrep = sysPrep;
            return this;
        }        public CustomImagePropertiesCustomResponse build() {
            return new CustomImagePropertiesCustomResponse(imageName, osType, sysPrep);
        }
    }
}
