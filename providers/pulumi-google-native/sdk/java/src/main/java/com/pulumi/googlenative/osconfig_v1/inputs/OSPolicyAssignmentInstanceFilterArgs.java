// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyAssignmentInstanceFilterInventoryArgs;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyAssignmentLabelSetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filters to select target VMs for an assignment. If more than one filter criteria is specified below, a VM will be selected if and only if it satisfies all of them.
 * 
 */
public final class OSPolicyAssignmentInstanceFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyAssignmentInstanceFilterArgs Empty = new OSPolicyAssignmentInstanceFilterArgs();

    /**
     * Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    @Import(name="all")
      private final @Nullable Output<Boolean> all;

    public Output<Boolean> all() {
        return this.all == null ? Codegen.empty() : this.all;
    }

    /**
     * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    @Import(name="exclusionLabels")
      private final @Nullable Output<List<OSPolicyAssignmentLabelSetArgs>> exclusionLabels;

    public Output<List<OSPolicyAssignmentLabelSetArgs>> exclusionLabels() {
        return this.exclusionLabels == null ? Codegen.empty() : this.exclusionLabels;
    }

    /**
     * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    @Import(name="inclusionLabels")
      private final @Nullable Output<List<OSPolicyAssignmentLabelSetArgs>> inclusionLabels;

    public Output<List<OSPolicyAssignmentLabelSetArgs>> inclusionLabels() {
        return this.inclusionLabels == null ? Codegen.empty() : this.inclusionLabels;
    }

    /**
     * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    @Import(name="inventories")
      private final @Nullable Output<List<OSPolicyAssignmentInstanceFilterInventoryArgs>> inventories;

    public Output<List<OSPolicyAssignmentInstanceFilterInventoryArgs>> inventories() {
        return this.inventories == null ? Codegen.empty() : this.inventories;
    }

    public OSPolicyAssignmentInstanceFilterArgs(
        @Nullable Output<Boolean> all,
        @Nullable Output<List<OSPolicyAssignmentLabelSetArgs>> exclusionLabels,
        @Nullable Output<List<OSPolicyAssignmentLabelSetArgs>> inclusionLabels,
        @Nullable Output<List<OSPolicyAssignmentInstanceFilterInventoryArgs>> inventories) {
        this.all = all;
        this.exclusionLabels = exclusionLabels;
        this.inclusionLabels = inclusionLabels;
        this.inventories = inventories;
    }

    private OSPolicyAssignmentInstanceFilterArgs() {
        this.all = Codegen.empty();
        this.exclusionLabels = Codegen.empty();
        this.inclusionLabels = Codegen.empty();
        this.inventories = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentInstanceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> all;
        private @Nullable Output<List<OSPolicyAssignmentLabelSetArgs>> exclusionLabels;
        private @Nullable Output<List<OSPolicyAssignmentLabelSetArgs>> inclusionLabels;
        private @Nullable Output<List<OSPolicyAssignmentInstanceFilterInventoryArgs>> inventories;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentInstanceFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.exclusionLabels = defaults.exclusionLabels;
    	      this.inclusionLabels = defaults.inclusionLabels;
    	      this.inventories = defaults.inventories;
        }

        public Builder all(@Nullable Output<Boolean> all) {
            this.all = all;
            return this;
        }
        public Builder all(@Nullable Boolean all) {
            this.all = Codegen.ofNullable(all);
            return this;
        }
        public Builder exclusionLabels(@Nullable Output<List<OSPolicyAssignmentLabelSetArgs>> exclusionLabels) {
            this.exclusionLabels = exclusionLabels;
            return this;
        }
        public Builder exclusionLabels(@Nullable List<OSPolicyAssignmentLabelSetArgs> exclusionLabels) {
            this.exclusionLabels = Codegen.ofNullable(exclusionLabels);
            return this;
        }
        public Builder exclusionLabels(OSPolicyAssignmentLabelSetArgs... exclusionLabels) {
            return exclusionLabels(List.of(exclusionLabels));
        }
        public Builder inclusionLabels(@Nullable Output<List<OSPolicyAssignmentLabelSetArgs>> inclusionLabels) {
            this.inclusionLabels = inclusionLabels;
            return this;
        }
        public Builder inclusionLabels(@Nullable List<OSPolicyAssignmentLabelSetArgs> inclusionLabels) {
            this.inclusionLabels = Codegen.ofNullable(inclusionLabels);
            return this;
        }
        public Builder inclusionLabels(OSPolicyAssignmentLabelSetArgs... inclusionLabels) {
            return inclusionLabels(List.of(inclusionLabels));
        }
        public Builder inventories(@Nullable Output<List<OSPolicyAssignmentInstanceFilterInventoryArgs>> inventories) {
            this.inventories = inventories;
            return this;
        }
        public Builder inventories(@Nullable List<OSPolicyAssignmentInstanceFilterInventoryArgs> inventories) {
            this.inventories = Codegen.ofNullable(inventories);
            return this;
        }
        public Builder inventories(OSPolicyAssignmentInstanceFilterInventoryArgs... inventories) {
            return inventories(List.of(inventories));
        }        public OSPolicyAssignmentInstanceFilterArgs build() {
            return new OSPolicyAssignmentInstanceFilterArgs(all, exclusionLabels, inclusionLabels, inventories);
        }
    }
}
