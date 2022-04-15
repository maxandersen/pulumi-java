// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationTypeVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationTypeVersionArgs Empty = new ApplicationTypeVersionArgs();

    /**
     * The URL to the application package
     * 
     */
    @Import(name="appPackageUrl", required=true)
      private final Output<String> appPackageUrl;

    public Output<String> appPackageUrl() {
        return this.appPackageUrl;
    }

    /**
     * The name of the application type name resource.
     * 
     */
    @Import(name="applicationTypeName", required=true)
      private final Output<String> applicationTypeName;

    public Output<String> applicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Azure resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The application type version.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ApplicationTypeVersionArgs(
        Output<String> appPackageUrl,
        Output<String> applicationTypeName,
        Output<String> clusterName,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> version) {
        this.appPackageUrl = Objects.requireNonNull(appPackageUrl, "expected parameter 'appPackageUrl' to be non-null");
        this.applicationTypeName = Objects.requireNonNull(applicationTypeName, "expected parameter 'applicationTypeName' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.version = version;
    }

    private ApplicationTypeVersionArgs() {
        this.appPackageUrl = Codegen.empty();
        this.applicationTypeName = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationTypeVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appPackageUrl;
        private Output<String> applicationTypeName;
        private Output<String> clusterName;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationTypeVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appPackageUrl = defaults.appPackageUrl;
    	      this.applicationTypeName = defaults.applicationTypeName;
    	      this.clusterName = defaults.clusterName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder appPackageUrl(Output<String> appPackageUrl) {
            this.appPackageUrl = Objects.requireNonNull(appPackageUrl);
            return this;
        }
        public Builder appPackageUrl(String appPackageUrl) {
            this.appPackageUrl = Output.of(Objects.requireNonNull(appPackageUrl));
            return this;
        }
        public Builder applicationTypeName(Output<String> applicationTypeName) {
            this.applicationTypeName = Objects.requireNonNull(applicationTypeName);
            return this;
        }
        public Builder applicationTypeName(String applicationTypeName) {
            this.applicationTypeName = Output.of(Objects.requireNonNull(applicationTypeName));
            return this;
        }
        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ApplicationTypeVersionArgs build() {
            return new ApplicationTypeVersionArgs(appPackageUrl, applicationTypeName, clusterName, location, resourceGroupName, tags, version);
        }
    }
}
