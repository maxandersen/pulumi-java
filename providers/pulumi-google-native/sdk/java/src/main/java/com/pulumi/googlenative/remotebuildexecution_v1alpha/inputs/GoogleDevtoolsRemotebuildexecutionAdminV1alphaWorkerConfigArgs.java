// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.remotebuildexecution_v1alpha.inputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the configuration to be used for creating workers in the worker pool.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs();

    /**
     * The accelerator card attached to each VM.
     * 
     */
    @Import(name="accelerator")
    private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs> accelerator;

    public Optional<Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs>> accelerator() {
        return Optional.ofNullable(this.accelerator);
    }

    /**
     * Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/
     * 
     */
    @Import(name="diskSizeGb", required=true)
    private Output<String> diskSizeGb;

    public Output<String> diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Disk Type to use for the worker. See [Storage options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-standard` and `pd-ssd` are supported.
     * 
     */
    @Import(name="diskType", required=true)
    private Output<String> diskType;

    public Output<String> diskType() {
        return this.diskType;
    }

    /**
     * Labels associated with the workers. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International letters are permitted. Label keys must start with a letter. Label values are optional. There can not be more than 64 labels per resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Machine type of the worker, such as `e2-standard-2`. See https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note that `f1-micro` and `g1-small` are not yet supported.
     * 
     */
    @Import(name="machineType", required=true)
    private Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType;
    }

    /**
     * The maximum number of actions a worker can execute concurrently.
     * 
     */
    @Import(name="maxConcurrentActions")
    private @Nullable Output<String> maxConcurrentActions;

    public Optional<Output<String>> maxConcurrentActions() {
        return Optional.ofNullable(this.maxConcurrentActions);
    }

    /**
     * Minimum CPU platform to use when creating the worker. See [CPU Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    /**
     * Determines the type of network access granted to workers. Possible values: - &#34;public&#34;: Workers can connect to the public internet. - &#34;private&#34;: Workers can only connect to Google APIs and services. - &#34;restricted-private&#34;: Workers can only connect to Google APIs that are reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
     * 
     */
    @Import(name="networkAccess")
    private @Nullable Output<String> networkAccess;

    public Optional<Output<String>> networkAccess() {
        return Optional.ofNullable(this.networkAccess);
    }

    /**
     * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and therefore won&#39;t be preempted). See [Preemptible VMs](https://cloud.google.com/preemptible-vms/) for more details.
     * 
     */
    @Import(name="reserved")
    private @Nullable Output<Boolean> reserved;

    public Optional<Output<Boolean>> reserved() {
        return Optional.ofNullable(this.reserved);
    }

    /**
     * The node type name to be used for sole-tenant nodes.
     * 
     */
    @Import(name="soleTenantNodeType")
    private @Nullable Output<String> soleTenantNodeType;

    public Optional<Output<String>> soleTenantNodeType() {
        return Optional.ofNullable(this.soleTenantNodeType);
    }

    /**
     * The name of the image used by each VM.
     * 
     */
    @Import(name="vmImage")
    private @Nullable Output<String> vmImage;

    public Optional<Output<String>> vmImage() {
        return Optional.ofNullable(this.vmImage);
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs() {}

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs $) {
        this.accelerator = $.accelerator;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
        this.labels = $.labels;
        this.machineType = $.machineType;
        this.maxConcurrentActions = $.maxConcurrentActions;
        this.minCpuPlatform = $.minCpuPlatform;
        this.networkAccess = $.networkAccess;
        this.reserved = $.reserved;
        this.soleTenantNodeType = $.soleTenantNodeType;
        this.vmImage = $.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs $;

        public Builder() {
            $ = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs();
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs defaults) {
            $ = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder accelerator(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs> accelerator) {
            $.accelerator = accelerator;
            return this;
        }

        public Builder accelerator(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs accelerator) {
            return accelerator(Output.of(accelerator));
        }

        public Builder diskSizeGb(Output<String> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder diskSizeGb(String diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        public Builder diskType(Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder machineType(Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public Builder maxConcurrentActions(@Nullable Output<String> maxConcurrentActions) {
            $.maxConcurrentActions = maxConcurrentActions;
            return this;
        }

        public Builder maxConcurrentActions(String maxConcurrentActions) {
            return maxConcurrentActions(Output.of(maxConcurrentActions));
        }

        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            return minCpuPlatform(Output.of(minCpuPlatform));
        }

        public Builder networkAccess(@Nullable Output<String> networkAccess) {
            $.networkAccess = networkAccess;
            return this;
        }

        public Builder networkAccess(String networkAccess) {
            return networkAccess(Output.of(networkAccess));
        }

        public Builder reserved(@Nullable Output<Boolean> reserved) {
            $.reserved = reserved;
            return this;
        }

        public Builder reserved(Boolean reserved) {
            return reserved(Output.of(reserved));
        }

        public Builder soleTenantNodeType(@Nullable Output<String> soleTenantNodeType) {
            $.soleTenantNodeType = soleTenantNodeType;
            return this;
        }

        public Builder soleTenantNodeType(String soleTenantNodeType) {
            return soleTenantNodeType(Output.of(soleTenantNodeType));
        }

        public Builder vmImage(@Nullable Output<String> vmImage) {
            $.vmImage = vmImage;
            return this;
        }

        public Builder vmImage(String vmImage) {
            return vmImage(Output.of(vmImage));
        }

        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs build() {
            $.diskSizeGb = Objects.requireNonNull($.diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
            $.diskType = Objects.requireNonNull($.diskType, "expected parameter 'diskType' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            return $;
        }
    }

}
