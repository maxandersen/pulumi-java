// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.metastore_v1alpha.enums.HiveMetastoreConfigEndpointProtocol;
import com.pulumi.googlenative.metastore_v1alpha.inputs.KerberosConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies configuration information specific to running Hive metastore software as the metastore service.
 * 
 */
public final class HiveMetastoreConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final HiveMetastoreConfigArgs Empty = new HiveMetastoreConfigArgs();

    /**
     * A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service&#39;s primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
     */
    @Import(name="auxiliaryVersions")
      private final @Nullable Output<Map<String,String>> auxiliaryVersions;

    public Output<Map<String,String>> auxiliaryVersions() {
        return this.auxiliaryVersions == null ? Codegen.empty() : this.auxiliaryVersions;
    }

    /**
     * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version&#39;s AuxiliaryVersionConfig.
     * 
     */
    @Import(name="configOverrides")
      private final @Nullable Output<Map<String,String>> configOverrides;

    public Output<Map<String,String>> configOverrides() {
        return this.configOverrides == null ? Codegen.empty() : this.configOverrides;
    }

    /**
     * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
     * 
     */
    @Import(name="endpointProtocol")
      private final @Nullable Output<HiveMetastoreConfigEndpointProtocol> endpointProtocol;

    public Output<HiveMetastoreConfigEndpointProtocol> endpointProtocol() {
        return this.endpointProtocol == null ? Codegen.empty() : this.endpointProtocol;
    }

    /**
     * Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field&#39;s path (hive_metastore_config.kerberos_config) in the request&#39;s update_mask while omitting this field from the request&#39;s service.
     * 
     */
    @Import(name="kerberosConfig")
      private final @Nullable Output<KerberosConfigArgs> kerberosConfig;

    public Output<KerberosConfigArgs> kerberosConfig() {
        return this.kerberosConfig == null ? Codegen.empty() : this.kerberosConfig;
    }

    /**
     * Immutable. The Hive metastore schema version.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public HiveMetastoreConfigArgs(
        @Nullable Output<Map<String,String>> auxiliaryVersions,
        @Nullable Output<Map<String,String>> configOverrides,
        @Nullable Output<HiveMetastoreConfigEndpointProtocol> endpointProtocol,
        @Nullable Output<KerberosConfigArgs> kerberosConfig,
        @Nullable Output<String> version) {
        this.auxiliaryVersions = auxiliaryVersions;
        this.configOverrides = configOverrides;
        this.endpointProtocol = endpointProtocol;
        this.kerberosConfig = kerberosConfig;
        this.version = version;
    }

    private HiveMetastoreConfigArgs() {
        this.auxiliaryVersions = Codegen.empty();
        this.configOverrides = Codegen.empty();
        this.endpointProtocol = Codegen.empty();
        this.kerberosConfig = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HiveMetastoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> auxiliaryVersions;
        private @Nullable Output<Map<String,String>> configOverrides;
        private @Nullable Output<HiveMetastoreConfigEndpointProtocol> endpointProtocol;
        private @Nullable Output<KerberosConfigArgs> kerberosConfig;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(HiveMetastoreConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryVersions = defaults.auxiliaryVersions;
    	      this.configOverrides = defaults.configOverrides;
    	      this.endpointProtocol = defaults.endpointProtocol;
    	      this.kerberosConfig = defaults.kerberosConfig;
    	      this.version = defaults.version;
        }

        public Builder auxiliaryVersions(@Nullable Output<Map<String,String>> auxiliaryVersions) {
            this.auxiliaryVersions = auxiliaryVersions;
            return this;
        }
        public Builder auxiliaryVersions(@Nullable Map<String,String> auxiliaryVersions) {
            this.auxiliaryVersions = Codegen.ofNullable(auxiliaryVersions);
            return this;
        }
        public Builder configOverrides(@Nullable Output<Map<String,String>> configOverrides) {
            this.configOverrides = configOverrides;
            return this;
        }
        public Builder configOverrides(@Nullable Map<String,String> configOverrides) {
            this.configOverrides = Codegen.ofNullable(configOverrides);
            return this;
        }
        public Builder endpointProtocol(@Nullable Output<HiveMetastoreConfigEndpointProtocol> endpointProtocol) {
            this.endpointProtocol = endpointProtocol;
            return this;
        }
        public Builder endpointProtocol(@Nullable HiveMetastoreConfigEndpointProtocol endpointProtocol) {
            this.endpointProtocol = Codegen.ofNullable(endpointProtocol);
            return this;
        }
        public Builder kerberosConfig(@Nullable Output<KerberosConfigArgs> kerberosConfig) {
            this.kerberosConfig = kerberosConfig;
            return this;
        }
        public Builder kerberosConfig(@Nullable KerberosConfigArgs kerberosConfig) {
            this.kerberosConfig = Codegen.ofNullable(kerberosConfig);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public HiveMetastoreConfigArgs build() {
            return new HiveMetastoreConfigArgs(auxiliaryVersions, configOverrides, endpointProtocol, kerberosConfig, version);
        }
    }
}
