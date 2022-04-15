// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.inputs.AdditionalFeaturesServerConfigurationsArgs;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SqlConnectivityUpdateSettingsArgs;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SqlStorageUpdateSettingsArgs;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SqlWorkloadTypeUpdateSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set the connectivity, storage and workload settings.
 * 
 */
public final class ServerConfigurationsManagementSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerConfigurationsManagementSettingsArgs Empty = new ServerConfigurationsManagementSettingsArgs();

    /**
     * Additional SQL feature settings.
     * 
     */
    @Import(name="additionalFeaturesServerConfigurations")
      private final @Nullable Output<AdditionalFeaturesServerConfigurationsArgs> additionalFeaturesServerConfigurations;

    public Output<AdditionalFeaturesServerConfigurationsArgs> additionalFeaturesServerConfigurations() {
        return this.additionalFeaturesServerConfigurations == null ? Codegen.empty() : this.additionalFeaturesServerConfigurations;
    }

    /**
     * SQL connectivity type settings.
     * 
     */
    @Import(name="sqlConnectivityUpdateSettings")
      private final @Nullable Output<SqlConnectivityUpdateSettingsArgs> sqlConnectivityUpdateSettings;

    public Output<SqlConnectivityUpdateSettingsArgs> sqlConnectivityUpdateSettings() {
        return this.sqlConnectivityUpdateSettings == null ? Codegen.empty() : this.sqlConnectivityUpdateSettings;
    }

    /**
     * SQL storage update settings.
     * 
     */
    @Import(name="sqlStorageUpdateSettings")
      private final @Nullable Output<SqlStorageUpdateSettingsArgs> sqlStorageUpdateSettings;

    public Output<SqlStorageUpdateSettingsArgs> sqlStorageUpdateSettings() {
        return this.sqlStorageUpdateSettings == null ? Codegen.empty() : this.sqlStorageUpdateSettings;
    }

    /**
     * SQL workload type settings.
     * 
     */
    @Import(name="sqlWorkloadTypeUpdateSettings")
      private final @Nullable Output<SqlWorkloadTypeUpdateSettingsArgs> sqlWorkloadTypeUpdateSettings;

    public Output<SqlWorkloadTypeUpdateSettingsArgs> sqlWorkloadTypeUpdateSettings() {
        return this.sqlWorkloadTypeUpdateSettings == null ? Codegen.empty() : this.sqlWorkloadTypeUpdateSettings;
    }

    public ServerConfigurationsManagementSettingsArgs(
        @Nullable Output<AdditionalFeaturesServerConfigurationsArgs> additionalFeaturesServerConfigurations,
        @Nullable Output<SqlConnectivityUpdateSettingsArgs> sqlConnectivityUpdateSettings,
        @Nullable Output<SqlStorageUpdateSettingsArgs> sqlStorageUpdateSettings,
        @Nullable Output<SqlWorkloadTypeUpdateSettingsArgs> sqlWorkloadTypeUpdateSettings) {
        this.additionalFeaturesServerConfigurations = additionalFeaturesServerConfigurations;
        this.sqlConnectivityUpdateSettings = sqlConnectivityUpdateSettings;
        this.sqlStorageUpdateSettings = sqlStorageUpdateSettings;
        this.sqlWorkloadTypeUpdateSettings = sqlWorkloadTypeUpdateSettings;
    }

    private ServerConfigurationsManagementSettingsArgs() {
        this.additionalFeaturesServerConfigurations = Codegen.empty();
        this.sqlConnectivityUpdateSettings = Codegen.empty();
        this.sqlStorageUpdateSettings = Codegen.empty();
        this.sqlWorkloadTypeUpdateSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerConfigurationsManagementSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AdditionalFeaturesServerConfigurationsArgs> additionalFeaturesServerConfigurations;
        private @Nullable Output<SqlConnectivityUpdateSettingsArgs> sqlConnectivityUpdateSettings;
        private @Nullable Output<SqlStorageUpdateSettingsArgs> sqlStorageUpdateSettings;
        private @Nullable Output<SqlWorkloadTypeUpdateSettingsArgs> sqlWorkloadTypeUpdateSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerConfigurationsManagementSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalFeaturesServerConfigurations = defaults.additionalFeaturesServerConfigurations;
    	      this.sqlConnectivityUpdateSettings = defaults.sqlConnectivityUpdateSettings;
    	      this.sqlStorageUpdateSettings = defaults.sqlStorageUpdateSettings;
    	      this.sqlWorkloadTypeUpdateSettings = defaults.sqlWorkloadTypeUpdateSettings;
        }

        public Builder additionalFeaturesServerConfigurations(@Nullable Output<AdditionalFeaturesServerConfigurationsArgs> additionalFeaturesServerConfigurations) {
            this.additionalFeaturesServerConfigurations = additionalFeaturesServerConfigurations;
            return this;
        }
        public Builder additionalFeaturesServerConfigurations(@Nullable AdditionalFeaturesServerConfigurationsArgs additionalFeaturesServerConfigurations) {
            this.additionalFeaturesServerConfigurations = Codegen.ofNullable(additionalFeaturesServerConfigurations);
            return this;
        }
        public Builder sqlConnectivityUpdateSettings(@Nullable Output<SqlConnectivityUpdateSettingsArgs> sqlConnectivityUpdateSettings) {
            this.sqlConnectivityUpdateSettings = sqlConnectivityUpdateSettings;
            return this;
        }
        public Builder sqlConnectivityUpdateSettings(@Nullable SqlConnectivityUpdateSettingsArgs sqlConnectivityUpdateSettings) {
            this.sqlConnectivityUpdateSettings = Codegen.ofNullable(sqlConnectivityUpdateSettings);
            return this;
        }
        public Builder sqlStorageUpdateSettings(@Nullable Output<SqlStorageUpdateSettingsArgs> sqlStorageUpdateSettings) {
            this.sqlStorageUpdateSettings = sqlStorageUpdateSettings;
            return this;
        }
        public Builder sqlStorageUpdateSettings(@Nullable SqlStorageUpdateSettingsArgs sqlStorageUpdateSettings) {
            this.sqlStorageUpdateSettings = Codegen.ofNullable(sqlStorageUpdateSettings);
            return this;
        }
        public Builder sqlWorkloadTypeUpdateSettings(@Nullable Output<SqlWorkloadTypeUpdateSettingsArgs> sqlWorkloadTypeUpdateSettings) {
            this.sqlWorkloadTypeUpdateSettings = sqlWorkloadTypeUpdateSettings;
            return this;
        }
        public Builder sqlWorkloadTypeUpdateSettings(@Nullable SqlWorkloadTypeUpdateSettingsArgs sqlWorkloadTypeUpdateSettings) {
            this.sqlWorkloadTypeUpdateSettings = Codegen.ofNullable(sqlWorkloadTypeUpdateSettings);
            return this;
        }        public ServerConfigurationsManagementSettingsArgs build() {
            return new ServerConfigurationsManagementSettingsArgs(additionalFeaturesServerConfigurations, sqlConnectivityUpdateSettings, sqlStorageUpdateSettings, sqlWorkloadTypeUpdateSettings);
        }
    }
}
