// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
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
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerArgs Empty = new InstanceGroupManagerArgs();

    /**
     * The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    @Import(name="autoHealingPolicies")
    private @Nullable Output<InstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies;

    public Optional<Output<InstanceGroupManagerAutoHealingPoliciesArgs>> autoHealingPolicies() {
        return Optional.ofNullable(this.autoHealingPolicies);
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
    private Output<String> baseInstanceName;

    public Output<String> baseInstanceName() {
        return this.baseInstanceName;
    }

    /**
     * An optional textual description of the instance
     * group manager.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * - Version name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    @Import(name="namedPorts")
    private @Nullable Output<List<InstanceGroupManagerNamedPortArgs>> namedPorts;

    public Optional<Output<List<InstanceGroupManagerNamedPortArgs>>> namedPorts() {
        return Optional.ofNullable(this.namedPorts);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * ) Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
     * 
     */
    @Import(name="statefulDisks")
    private @Nullable Output<List<InstanceGroupManagerStatefulDiskArgs>> statefulDisks;

    public Optional<Output<List<InstanceGroupManagerStatefulDiskArgs>>> statefulDisks() {
        return Optional.ofNullable(this.statefulDisks);
    }

    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    @Import(name="targetPools")
    private @Nullable Output<List<String>> targetPools;

    public Optional<Output<List<String>>> targetPools() {
        return Optional.ofNullable(this.targetPools);
    }

    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @Import(name="targetSize")
    private @Nullable Output<Integer> targetSize;

    public Optional<Output<Integer>> targetSize() {
        return Optional.ofNullable(this.targetSize);
    }

    /**
     * The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch)
     * 
     */
    @Import(name="updatePolicy")
    private @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;

    public Optional<Output<InstanceGroupManagerUpdatePolicyArgs>> updatePolicy() {
        return Optional.ofNullable(this.updatePolicy);
    }

    /**
     * Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    @Import(name="versions", required=true)
    private Output<List<InstanceGroupManagerVersionArgs>> versions;

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
    private @Nullable Output<Boolean> waitForInstances;

    public Optional<Output<Boolean>> waitForInstances() {
        return Optional.ofNullable(this.waitForInstances);
    }

    /**
     * When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    @Import(name="waitForInstancesStatus")
    private @Nullable Output<String> waitForInstancesStatus;

    public Optional<Output<String>> waitForInstancesStatus() {
        return Optional.ofNullable(this.waitForInstancesStatus);
    }

    /**
     * The zone that instances in this group should be created
     * in.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceGroupManagerArgs() {}

    private InstanceGroupManagerArgs(InstanceGroupManagerArgs $) {
        this.autoHealingPolicies = $.autoHealingPolicies;
        this.baseInstanceName = $.baseInstanceName;
        this.description = $.description;
        this.name = $.name;
        this.namedPorts = $.namedPorts;
        this.project = $.project;
        this.statefulDisks = $.statefulDisks;
        this.targetPools = $.targetPools;
        this.targetSize = $.targetSize;
        this.updatePolicy = $.updatePolicy;
        this.versions = $.versions;
        this.waitForInstances = $.waitForInstances;
        this.waitForInstancesStatus = $.waitForInstancesStatus;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerArgs $;

        public Builder() {
            $ = new InstanceGroupManagerArgs();
        }

        public Builder(InstanceGroupManagerArgs defaults) {
            $ = new InstanceGroupManagerArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoHealingPolicies(@Nullable Output<InstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies) {
            $.autoHealingPolicies = autoHealingPolicies;
            return this;
        }

        public Builder autoHealingPolicies(InstanceGroupManagerAutoHealingPoliciesArgs autoHealingPolicies) {
            return autoHealingPolicies(Output.of(autoHealingPolicies));
        }

        public Builder baseInstanceName(Output<String> baseInstanceName) {
            $.baseInstanceName = baseInstanceName;
            return this;
        }

        public Builder baseInstanceName(String baseInstanceName) {
            return baseInstanceName(Output.of(baseInstanceName));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namedPorts(@Nullable Output<List<InstanceGroupManagerNamedPortArgs>> namedPorts) {
            $.namedPorts = namedPorts;
            return this;
        }

        public Builder namedPorts(List<InstanceGroupManagerNamedPortArgs> namedPorts) {
            return namedPorts(Output.of(namedPorts));
        }

        public Builder namedPorts(InstanceGroupManagerNamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder statefulDisks(@Nullable Output<List<InstanceGroupManagerStatefulDiskArgs>> statefulDisks) {
            $.statefulDisks = statefulDisks;
            return this;
        }

        public Builder statefulDisks(List<InstanceGroupManagerStatefulDiskArgs> statefulDisks) {
            return statefulDisks(Output.of(statefulDisks));
        }

        public Builder statefulDisks(InstanceGroupManagerStatefulDiskArgs... statefulDisks) {
            return statefulDisks(List.of(statefulDisks));
        }

        public Builder targetPools(@Nullable Output<List<String>> targetPools) {
            $.targetPools = targetPools;
            return this;
        }

        public Builder targetPools(List<String> targetPools) {
            return targetPools(Output.of(targetPools));
        }

        public Builder targetPools(String... targetPools) {
            return targetPools(List.of(targetPools));
        }

        public Builder targetSize(@Nullable Output<Integer> targetSize) {
            $.targetSize = targetSize;
            return this;
        }

        public Builder targetSize(Integer targetSize) {
            return targetSize(Output.of(targetSize));
        }

        public Builder updatePolicy(@Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy) {
            $.updatePolicy = updatePolicy;
            return this;
        }

        public Builder updatePolicy(InstanceGroupManagerUpdatePolicyArgs updatePolicy) {
            return updatePolicy(Output.of(updatePolicy));
        }

        public Builder versions(Output<List<InstanceGroupManagerVersionArgs>> versions) {
            $.versions = versions;
            return this;
        }

        public Builder versions(List<InstanceGroupManagerVersionArgs> versions) {
            return versions(Output.of(versions));
        }

        public Builder versions(InstanceGroupManagerVersionArgs... versions) {
            return versions(List.of(versions));
        }

        public Builder waitForInstances(@Nullable Output<Boolean> waitForInstances) {
            $.waitForInstances = waitForInstances;
            return this;
        }

        public Builder waitForInstances(Boolean waitForInstances) {
            return waitForInstances(Output.of(waitForInstances));
        }

        public Builder waitForInstancesStatus(@Nullable Output<String> waitForInstancesStatus) {
            $.waitForInstancesStatus = waitForInstancesStatus;
            return this;
        }

        public Builder waitForInstancesStatus(String waitForInstancesStatus) {
            return waitForInstancesStatus(Output.of(waitForInstancesStatus));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceGroupManagerArgs build() {
            $.baseInstanceName = Objects.requireNonNull($.baseInstanceName, "expected parameter 'baseInstanceName' to be non-null");
            $.versions = Objects.requireNonNull($.versions, "expected parameter 'versions' to be non-null");
            return $;
        }
    }

}
