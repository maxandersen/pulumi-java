// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerAutoHealingPoliciesArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerNamedPortArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulDiskArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerUpdatePolicyArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerArgs Empty = new InstanceGroupManagerArgs();

    /**
     * The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    @Import(name="autoHealingPolicies")
      private final @Nullable Output<InstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies;

    public Output<InstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies() {
        return this.autoHealingPolicies == null ? Codegen.empty() : this.autoHealingPolicies;
    }

    /**
     * The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     * 
     */
    @Import(name="baseInstanceName", required=true)
      private final Output<String> baseInstanceName;

    public Output<String> baseInstanceName() {
        return this.baseInstanceName;
    }

    /**
     * An optional textual description of the instance
     * group manager.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * - Version name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    @Import(name="namedPorts")
      private final @Nullable Output<List<InstanceGroupManagerNamedPortArgs>> namedPorts;

    public Output<List<InstanceGroupManagerNamedPortArgs>> namedPorts() {
        return this.namedPorts == null ? Codegen.empty() : this.namedPorts;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * ) Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
     * 
     */
    @Import(name="statefulDisks")
      private final @Nullable Output<List<InstanceGroupManagerStatefulDiskArgs>> statefulDisks;

    public Output<List<InstanceGroupManagerStatefulDiskArgs>> statefulDisks() {
        return this.statefulDisks == null ? Codegen.empty() : this.statefulDisks;
    }

    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    @Import(name="targetPools")
      private final @Nullable Output<List<String>> targetPools;

    public Output<List<String>> targetPools() {
        return this.targetPools == null ? Codegen.empty() : this.targetPools;
    }

    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @Import(name="targetSize")
      private final @Nullable Output<Integer> targetSize;

    public Output<Integer> targetSize() {
        return this.targetSize == null ? Codegen.empty() : this.targetSize;
    }

    /**
     * The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch)
     * 
     */
    @Import(name="updatePolicy")
      private final @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;

    public Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy() {
        return this.updatePolicy == null ? Codegen.empty() : this.updatePolicy;
    }

    /**
     * Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    @Import(name="versions", required=true)
      private final Output<List<InstanceGroupManagerVersionArgs>> versions;

    public Output<List<InstanceGroupManagerVersionArgs>> versions() {
        return this.versions;
    }

    /**
     * Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, this provider will
     * continue trying until it times out.
     * 
     */
    @Import(name="waitForInstances")
      private final @Nullable Output<Boolean> waitForInstances;

    public Output<Boolean> waitForInstances() {
        return this.waitForInstances == null ? Codegen.empty() : this.waitForInstances;
    }

    /**
     * When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    @Import(name="waitForInstancesStatus")
      private final @Nullable Output<String> waitForInstancesStatus;

    public Output<String> waitForInstancesStatus() {
        return this.waitForInstancesStatus == null ? Codegen.empty() : this.waitForInstancesStatus;
    }

    /**
     * The zone that instances in this group should be created
     * in.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public InstanceGroupManagerArgs(
        @Nullable Output<InstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies,
        Output<String> baseInstanceName,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<InstanceGroupManagerNamedPortArgs>> namedPorts,
        @Nullable Output<String> project,
        @Nullable Output<List<InstanceGroupManagerStatefulDiskArgs>> statefulDisks,
        @Nullable Output<List<String>> targetPools,
        @Nullable Output<Integer> targetSize,
        @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy,
        Output<List<InstanceGroupManagerVersionArgs>> versions,
        @Nullable Output<Boolean> waitForInstances,
        @Nullable Output<String> waitForInstancesStatus,
        @Nullable Output<String> zone) {
        this.autoHealingPolicies = autoHealingPolicies;
        this.baseInstanceName = Objects.requireNonNull(baseInstanceName, "expected parameter 'baseInstanceName' to be non-null");
        this.description = description;
        this.name = name;
        this.namedPorts = namedPorts;
        this.project = project;
        this.statefulDisks = statefulDisks;
        this.targetPools = targetPools;
        this.targetSize = targetSize;
        this.updatePolicy = updatePolicy;
        this.versions = Objects.requireNonNull(versions, "expected parameter 'versions' to be non-null");
        this.waitForInstances = waitForInstances;
        this.waitForInstancesStatus = waitForInstancesStatus;
        this.zone = zone;
    }

    private InstanceGroupManagerArgs() {
        this.autoHealingPolicies = Codegen.empty();
        this.baseInstanceName = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.namedPorts = Codegen.empty();
        this.project = Codegen.empty();
        this.statefulDisks = Codegen.empty();
        this.targetPools = Codegen.empty();
        this.targetSize = Codegen.empty();
        this.updatePolicy = Codegen.empty();
        this.versions = Codegen.empty();
        this.waitForInstances = Codegen.empty();
        this.waitForInstancesStatus = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies;
        private Output<String> baseInstanceName;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<InstanceGroupManagerNamedPortArgs>> namedPorts;
        private @Nullable Output<String> project;
        private @Nullable Output<List<InstanceGroupManagerStatefulDiskArgs>> statefulDisks;
        private @Nullable Output<List<String>> targetPools;
        private @Nullable Output<Integer> targetSize;
        private @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;
        private Output<List<InstanceGroupManagerVersionArgs>> versions;
        private @Nullable Output<Boolean> waitForInstances;
        private @Nullable Output<String> waitForInstancesStatus;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealingPolicies = defaults.autoHealingPolicies;
    	      this.baseInstanceName = defaults.baseInstanceName;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.project = defaults.project;
    	      this.statefulDisks = defaults.statefulDisks;
    	      this.targetPools = defaults.targetPools;
    	      this.targetSize = defaults.targetSize;
    	      this.updatePolicy = defaults.updatePolicy;
    	      this.versions = defaults.versions;
    	      this.waitForInstances = defaults.waitForInstances;
    	      this.waitForInstancesStatus = defaults.waitForInstancesStatus;
    	      this.zone = defaults.zone;
        }

        public Builder autoHealingPolicies(@Nullable Output<InstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies) {
            this.autoHealingPolicies = autoHealingPolicies;
            return this;
        }
        public Builder autoHealingPolicies(@Nullable InstanceGroupManagerAutoHealingPoliciesArgs autoHealingPolicies) {
            this.autoHealingPolicies = Codegen.ofNullable(autoHealingPolicies);
            return this;
        }
        public Builder baseInstanceName(Output<String> baseInstanceName) {
            this.baseInstanceName = Objects.requireNonNull(baseInstanceName);
            return this;
        }
        public Builder baseInstanceName(String baseInstanceName) {
            this.baseInstanceName = Output.of(Objects.requireNonNull(baseInstanceName));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder namedPorts(@Nullable Output<List<InstanceGroupManagerNamedPortArgs>> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }
        public Builder namedPorts(@Nullable List<InstanceGroupManagerNamedPortArgs> namedPorts) {
            this.namedPorts = Codegen.ofNullable(namedPorts);
            return this;
        }
        public Builder namedPorts(InstanceGroupManagerNamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder statefulDisks(@Nullable Output<List<InstanceGroupManagerStatefulDiskArgs>> statefulDisks) {
            this.statefulDisks = statefulDisks;
            return this;
        }
        public Builder statefulDisks(@Nullable List<InstanceGroupManagerStatefulDiskArgs> statefulDisks) {
            this.statefulDisks = Codegen.ofNullable(statefulDisks);
            return this;
        }
        public Builder statefulDisks(InstanceGroupManagerStatefulDiskArgs... statefulDisks) {
            return statefulDisks(List.of(statefulDisks));
        }
        public Builder targetPools(@Nullable Output<List<String>> targetPools) {
            this.targetPools = targetPools;
            return this;
        }
        public Builder targetPools(@Nullable List<String> targetPools) {
            this.targetPools = Codegen.ofNullable(targetPools);
            return this;
        }
        public Builder targetPools(String... targetPools) {
            return targetPools(List.of(targetPools));
        }
        public Builder targetSize(@Nullable Output<Integer> targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public Builder targetSize(@Nullable Integer targetSize) {
            this.targetSize = Codegen.ofNullable(targetSize);
            return this;
        }
        public Builder updatePolicy(@Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy) {
            this.updatePolicy = updatePolicy;
            return this;
        }
        public Builder updatePolicy(@Nullable InstanceGroupManagerUpdatePolicyArgs updatePolicy) {
            this.updatePolicy = Codegen.ofNullable(updatePolicy);
            return this;
        }
        public Builder versions(Output<List<InstanceGroupManagerVersionArgs>> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(List<InstanceGroupManagerVersionArgs> versions) {
            this.versions = Output.of(Objects.requireNonNull(versions));
            return this;
        }
        public Builder versions(InstanceGroupManagerVersionArgs... versions) {
            return versions(List.of(versions));
        }
        public Builder waitForInstances(@Nullable Output<Boolean> waitForInstances) {
            this.waitForInstances = waitForInstances;
            return this;
        }
        public Builder waitForInstances(@Nullable Boolean waitForInstances) {
            this.waitForInstances = Codegen.ofNullable(waitForInstances);
            return this;
        }
        public Builder waitForInstancesStatus(@Nullable Output<String> waitForInstancesStatus) {
            this.waitForInstancesStatus = waitForInstancesStatus;
            return this;
        }
        public Builder waitForInstancesStatus(@Nullable String waitForInstancesStatus) {
            this.waitForInstancesStatus = Codegen.ofNullable(waitForInstancesStatus);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public InstanceGroupManagerArgs build() {
            return new InstanceGroupManagerArgs(autoHealingPolicies, baseInstanceName, description, name, namedPorts, project, statefulDisks, targetPools, targetSize, updatePolicy, versions, waitForInstances, waitForInstancesStatus, zone);
        }
    }
}
