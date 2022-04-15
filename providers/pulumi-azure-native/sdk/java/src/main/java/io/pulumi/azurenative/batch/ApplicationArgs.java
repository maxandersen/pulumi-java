// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * A value indicating whether packages within the application may be overwritten using the same version string.
     * 
     */
    @Import(name="allowUpdates")
      private final @Nullable Output<Boolean> allowUpdates;

    public Output<Boolean> allowUpdates() {
        return this.allowUpdates == null ? Codegen.empty() : this.allowUpdates;
    }

    /**
     * The name of the application. This must be unique within the account.
     * 
     */
    @Import(name="applicationName")
      private final @Nullable Output<String> applicationName;

    public Output<String> applicationName() {
        return this.applicationName == null ? Codegen.empty() : this.applicationName;
    }

    /**
     * The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
     * 
     */
    @Import(name="defaultVersion")
      private final @Nullable Output<String> defaultVersion;

    public Output<String> defaultVersion() {
        return this.defaultVersion == null ? Codegen.empty() : this.defaultVersion;
    }

    /**
     * The display name for the application.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public ApplicationArgs(
        Output<String> accountName,
        @Nullable Output<Boolean> allowUpdates,
        @Nullable Output<String> applicationName,
        @Nullable Output<String> defaultVersion,
        @Nullable Output<String> displayName,
        Output<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.allowUpdates = allowUpdates;
        this.applicationName = applicationName;
        this.defaultVersion = defaultVersion;
        this.displayName = displayName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ApplicationArgs() {
        this.accountName = Codegen.empty();
        this.allowUpdates = Codegen.empty();
        this.applicationName = Codegen.empty();
        this.defaultVersion = Codegen.empty();
        this.displayName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<Boolean> allowUpdates;
        private @Nullable Output<String> applicationName;
        private @Nullable Output<String> defaultVersion;
        private @Nullable Output<String> displayName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.allowUpdates = defaults.allowUpdates;
    	      this.applicationName = defaults.applicationName;
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.displayName = defaults.displayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder allowUpdates(@Nullable Output<Boolean> allowUpdates) {
            this.allowUpdates = allowUpdates;
            return this;
        }
        public Builder allowUpdates(@Nullable Boolean allowUpdates) {
            this.allowUpdates = Codegen.ofNullable(allowUpdates);
            return this;
        }
        public Builder applicationName(@Nullable Output<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public Builder applicationName(@Nullable String applicationName) {
            this.applicationName = Codegen.ofNullable(applicationName);
            return this;
        }
        public Builder defaultVersion(@Nullable Output<String> defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Builder defaultVersion(@Nullable String defaultVersion) {
            this.defaultVersion = Codegen.ofNullable(defaultVersion);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public ApplicationArgs build() {
            return new ApplicationArgs(accountName, allowUpdates, applicationName, defaultVersion, displayName, resourceGroupName);
        }
    }
}
