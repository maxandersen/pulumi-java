// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * Specify the $expand query. Example: 'properties($select=email)'
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> expand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
      private final String labAccountName;

    public String labAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
      private final String labName;

    public String labName() {
        return this.labName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the user.
     * 
     */
    @Import(name="userName", required=true)
      private final String userName;

    public String userName() {
        return this.userName;
    }

    public GetUserArgs(
        @Nullable String expand,
        String labAccountName,
        String labName,
        String resourceGroupName,
        String userName) {
        this.expand = expand;
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private GetUserArgs() {
        this.expand = null;
        this.labAccountName = null;
        this.labName = null;
        this.resourceGroupName = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String labAccountName;
        private String labName;
        private String resourceGroupName;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.labAccountName = defaults.labAccountName;
    	      this.labName = defaults.labName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.userName = defaults.userName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder labAccountName(String labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }
        public Builder labName(String labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetUserArgs build() {
            return new GetUserArgs(expand, labAccountName, labName, resourceGroupName, userName);
        }
    }
}
