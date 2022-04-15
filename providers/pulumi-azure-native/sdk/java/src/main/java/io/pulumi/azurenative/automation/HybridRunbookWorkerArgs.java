// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HybridRunbookWorkerArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridRunbookWorkerArgs Empty = new HybridRunbookWorkerArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final Output<String> automationAccountName;

    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The hybrid runbook worker group name
     * 
     */
    @Import(name="hybridRunbookWorkerGroupName", required=true)
      private final Output<String> hybridRunbookWorkerGroupName;

    public Output<String> hybridRunbookWorkerGroupName() {
        return this.hybridRunbookWorkerGroupName;
    }

    /**
     * The hybrid runbook worker id
     * 
     */
    @Import(name="hybridRunbookWorkerId")
      private final @Nullable Output<String> hybridRunbookWorkerId;

    public Output<String> hybridRunbookWorkerId() {
        return this.hybridRunbookWorkerId == null ? Codegen.empty() : this.hybridRunbookWorkerId;
    }

    /**
     * Gets or sets the name of the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Azure Resource Manager Id for a virtual machine.
     * 
     */
    @Import(name="vmResourceId")
      private final @Nullable Output<String> vmResourceId;

    public Output<String> vmResourceId() {
        return this.vmResourceId == null ? Codegen.empty() : this.vmResourceId;
    }

    public HybridRunbookWorkerArgs(
        Output<String> automationAccountName,
        Output<String> hybridRunbookWorkerGroupName,
        @Nullable Output<String> hybridRunbookWorkerId,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> vmResourceId) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.hybridRunbookWorkerGroupName = Objects.requireNonNull(hybridRunbookWorkerGroupName, "expected parameter 'hybridRunbookWorkerGroupName' to be non-null");
        this.hybridRunbookWorkerId = hybridRunbookWorkerId;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmResourceId = vmResourceId;
    }

    private HybridRunbookWorkerArgs() {
        this.automationAccountName = Codegen.empty();
        this.hybridRunbookWorkerGroupName = Codegen.empty();
        this.hybridRunbookWorkerId = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.vmResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridRunbookWorkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private Output<String> hybridRunbookWorkerGroupName;
        private @Nullable Output<String> hybridRunbookWorkerId;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> vmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridRunbookWorkerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.hybridRunbookWorkerGroupName = defaults.hybridRunbookWorkerGroupName;
    	      this.hybridRunbookWorkerId = defaults.hybridRunbookWorkerId;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmResourceId = defaults.vmResourceId;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }
        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }
        public Builder hybridRunbookWorkerGroupName(Output<String> hybridRunbookWorkerGroupName) {
            this.hybridRunbookWorkerGroupName = Objects.requireNonNull(hybridRunbookWorkerGroupName);
            return this;
        }
        public Builder hybridRunbookWorkerGroupName(String hybridRunbookWorkerGroupName) {
            this.hybridRunbookWorkerGroupName = Output.of(Objects.requireNonNull(hybridRunbookWorkerGroupName));
            return this;
        }
        public Builder hybridRunbookWorkerId(@Nullable Output<String> hybridRunbookWorkerId) {
            this.hybridRunbookWorkerId = hybridRunbookWorkerId;
            return this;
        }
        public Builder hybridRunbookWorkerId(@Nullable String hybridRunbookWorkerId) {
            this.hybridRunbookWorkerId = Codegen.ofNullable(hybridRunbookWorkerId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder vmResourceId(@Nullable Output<String> vmResourceId) {
            this.vmResourceId = vmResourceId;
            return this;
        }
        public Builder vmResourceId(@Nullable String vmResourceId) {
            this.vmResourceId = Codegen.ofNullable(vmResourceId);
            return this;
        }        public HybridRunbookWorkerArgs build() {
            return new HybridRunbookWorkerArgs(automationAccountName, hybridRunbookWorkerGroupName, hybridRunbookWorkerId, name, resourceGroupName, vmResourceId);
        }
    }
}
