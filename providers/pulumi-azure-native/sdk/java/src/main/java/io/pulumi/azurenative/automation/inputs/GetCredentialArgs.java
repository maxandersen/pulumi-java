// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCredentialArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCredentialArgs Empty = new GetCredentialArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final String automationAccountName;

    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The name of credential.
     * 
     */
    @Import(name="credentialName", required=true)
      private final String credentialName;

    public String credentialName() {
        return this.credentialName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetCredentialArgs(
        String automationAccountName,
        String credentialName,
        String resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.credentialName = Objects.requireNonNull(credentialName, "expected parameter 'credentialName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCredentialArgs() {
        this.automationAccountName = null;
        this.credentialName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String credentialName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.credentialName = defaults.credentialName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }
        public Builder credentialName(String credentialName) {
            this.credentialName = Objects.requireNonNull(credentialName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetCredentialArgs build() {
            return new GetCredentialArgs(automationAccountName, credentialName, resourceGroupName);
        }
    }
}
