// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFavoriteProcessArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFavoriteProcessArgs Empty = new GetFavoriteProcessArgs();

    /**
     * The resource name of a favorite process in a package. If the process name contains characters that are not allowed in Azure Resource Name, we use 'actualProcessName' in request body to submit the name.
     * 
     */
    @Import(name="favoriteProcessResourceName", required=true)
      private final String favoriteProcessResourceName;

    public String favoriteProcessResourceName() {
        return this.favoriteProcessResourceName;
    }

    /**
     * The resource name of the Test Base Package.
     * 
     */
    @Import(name="packageName", required=true)
      private final String packageName;

    public String packageName() {
        return this.packageName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
      private final String testBaseAccountName;

    public String testBaseAccountName() {
        return this.testBaseAccountName;
    }

    public GetFavoriteProcessArgs(
        String favoriteProcessResourceName,
        String packageName,
        String resourceGroupName,
        String testBaseAccountName) {
        this.favoriteProcessResourceName = Objects.requireNonNull(favoriteProcessResourceName, "expected parameter 'favoriteProcessResourceName' to be non-null");
        this.packageName = Objects.requireNonNull(packageName, "expected parameter 'packageName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
    }

    private GetFavoriteProcessArgs() {
        this.favoriteProcessResourceName = null;
        this.packageName = null;
        this.resourceGroupName = null;
        this.testBaseAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFavoriteProcessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String favoriteProcessResourceName;
        private String packageName;
        private String resourceGroupName;
        private String testBaseAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFavoriteProcessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.favoriteProcessResourceName = defaults.favoriteProcessResourceName;
    	      this.packageName = defaults.packageName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
        }

        public Builder favoriteProcessResourceName(String favoriteProcessResourceName) {
            this.favoriteProcessResourceName = Objects.requireNonNull(favoriteProcessResourceName);
            return this;
        }
        public Builder packageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder testBaseAccountName(String testBaseAccountName) {
            this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName);
            return this;
        }        public GetFavoriteProcessArgs build() {
            return new GetFavoriteProcessArgs(favoriteProcessResourceName, packageName, resourceGroupName, testBaseAccountName);
        }
    }
}
