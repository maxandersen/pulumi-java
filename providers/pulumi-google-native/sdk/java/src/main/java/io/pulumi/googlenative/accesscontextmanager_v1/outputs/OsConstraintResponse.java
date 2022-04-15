// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OsConstraintResponse {
    /**
     * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
     * 
     */
    private final String minimumVersion;
    /**
     * The allowed OS type.
     * 
     */
    private final String osType;
    /**
     * Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
     * 
     */
    private final Boolean requireVerifiedChromeOs;

    @CustomType.Constructor
    private OsConstraintResponse(
        @CustomType.Parameter("minimumVersion") String minimumVersion,
        @CustomType.Parameter("osType") String osType,
        @CustomType.Parameter("requireVerifiedChromeOs") Boolean requireVerifiedChromeOs) {
        this.minimumVersion = minimumVersion;
        this.osType = osType;
        this.requireVerifiedChromeOs = requireVerifiedChromeOs;
    }

    /**
     * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
     * 
    */
    public String minimumVersion() {
        return this.minimumVersion;
    }
    /**
     * The allowed OS type.
     * 
    */
    public String osType() {
        return this.osType;
    }
    /**
     * Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
     * 
    */
    public Boolean requireVerifiedChromeOs() {
        return this.requireVerifiedChromeOs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsConstraintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String minimumVersion;
        private String osType;
        private Boolean requireVerifiedChromeOs;

        public Builder() {
    	      // Empty
        }

        public Builder(OsConstraintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
    	      this.requireVerifiedChromeOs = defaults.requireVerifiedChromeOs;
        }

        public Builder minimumVersion(String minimumVersion) {
            this.minimumVersion = Objects.requireNonNull(minimumVersion);
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder requireVerifiedChromeOs(Boolean requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = Objects.requireNonNull(requireVerifiedChromeOs);
            return this;
        }        public OsConstraintResponse build() {
            return new OsConstraintResponse(minimumVersion, osType, requireVerifiedChromeOs);
        }
    }
}
