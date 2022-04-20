// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelBasicConditionDevicePolicyOsConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessLevelBasicConditionDevicePolicyOsConstraintArgs Empty = new AccessLevelBasicConditionDevicePolicyOsConstraintArgs();

    /**
     * The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: &#34;major.minor.patch&#34; such as &#34;10.5.301&#34;, &#34;9.2.1&#34;.
     * 
     */
    @Import(name="minimumVersion")
      private final @Nullable Output<String> minimumVersion;

    public Output<String> minimumVersion() {
        return this.minimumVersion == null ? Codegen.empty() : this.minimumVersion;
    }

    /**
     * The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
     */
    @Import(name="osType", required=true)
      private final Output<String> osType;

    public Output<String> osType() {
        return this.osType;
    }

    /**
     * If you specify DESKTOP_CHROME_OS for osType, you can optionally include requireVerifiedChromeOs to require Chrome Verified Access.
     * 
     */
    @Import(name="requireVerifiedChromeOs")
      private final @Nullable Output<Boolean> requireVerifiedChromeOs;

    public Output<Boolean> requireVerifiedChromeOs() {
        return this.requireVerifiedChromeOs == null ? Codegen.empty() : this.requireVerifiedChromeOs;
    }

    public AccessLevelBasicConditionDevicePolicyOsConstraintArgs(
        @Nullable Output<String> minimumVersion,
        Output<String> osType,
        @Nullable Output<Boolean> requireVerifiedChromeOs) {
        this.minimumVersion = minimumVersion;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.requireVerifiedChromeOs = requireVerifiedChromeOs;
    }

    private AccessLevelBasicConditionDevicePolicyOsConstraintArgs() {
        this.minimumVersion = Codegen.empty();
        this.osType = Codegen.empty();
        this.requireVerifiedChromeOs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> minimumVersion;
        private Output<String> osType;
        private @Nullable Output<Boolean> requireVerifiedChromeOs;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
    	      this.requireVerifiedChromeOs = defaults.requireVerifiedChromeOs;
        }

        public Builder minimumVersion(@Nullable Output<String> minimumVersion) {
            this.minimumVersion = minimumVersion;
            return this;
        }
        public Builder minimumVersion(@Nullable String minimumVersion) {
            this.minimumVersion = Codegen.ofNullable(minimumVersion);
            return this;
        }
        public Builder osType(Output<String> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Output.of(Objects.requireNonNull(osType));
            return this;
        }
        public Builder requireVerifiedChromeOs(@Nullable Output<Boolean> requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = requireVerifiedChromeOs;
            return this;
        }
        public Builder requireVerifiedChromeOs(@Nullable Boolean requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = Codegen.ofNullable(requireVerifiedChromeOs);
            return this;
        }        public AccessLevelBasicConditionDevicePolicyOsConstraintArgs build() {
            return new AccessLevelBasicConditionDevicePolicyOsConstraintArgs(minimumVersion, osType, requireVerifiedChromeOs);
        }
    }
}
