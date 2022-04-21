// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.notebooks.inputs.InstanceAcceleratorConfigArgs;
import com.pulumi.gcp.notebooks.inputs.InstanceContainerImageArgs;
import com.pulumi.gcp.notebooks.inputs.InstanceReservationAffinityArgs;
import com.pulumi.gcp.notebooks.inputs.InstanceShieldedInstanceConfigArgs;
import com.pulumi.gcp.notebooks.inputs.InstanceVmImageArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The hardware accelerator used on this instance. If you use accelerators,
     * make sure that your configuration has enough vCPUs and memory to support the
     * machineType you have selected.
     * Structure is documented below.
     * 
     */
    @Import(name="acceleratorConfig")
    private @Nullable Output<InstanceAcceleratorConfigArgs> acceleratorConfig;

    public Optional<Output<InstanceAcceleratorConfigArgs>> acceleratorConfig() {
        return Optional.ofNullable(this.acceleratorConfig);
    }

    /**
     * The size of the boot disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB.
     * If not specified, this defaults to 100.
     * 
     */
    @Import(name="bootDiskSizeGb")
    private @Nullable Output<Integer> bootDiskSizeGb;

    public Optional<Output<Integer>> bootDiskSizeGb() {
        return Optional.ofNullable(this.bootDiskSizeGb);
    }

    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @Import(name="bootDiskType")
    private @Nullable Output<String> bootDiskType;

    public Optional<Output<String>> bootDiskType() {
        return Optional.ofNullable(this.bootDiskType);
    }

    /**
     * Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="containerImage")
    private @Nullable Output<InstanceContainerImageArgs> containerImage;

    public Optional<Output<InstanceContainerImageArgs>> containerImage() {
        return Optional.ofNullable(this.containerImage);
    }

    /**
     * Instance creation time
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    @Import(name="customGpuDriverPath")
    private @Nullable Output<String> customGpuDriverPath;

    public Optional<Output<String>> customGpuDriverPath() {
        return Optional.ofNullable(this.customGpuDriverPath);
    }

    /**
     * The size of the data disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB).
     * You can choose the size of the data disk based on how big your notebooks and data are.
     * If not specified, this defaults to 100.
     * 
     */
    @Import(name="dataDiskSizeGb")
    private @Nullable Output<Integer> dataDiskSizeGb;

    public Optional<Output<Integer>> dataDiskSizeGb() {
        return Optional.ofNullable(this.dataDiskSizeGb);
    }

    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @Import(name="dataDiskType")
    private @Nullable Output<String> dataDiskType;

    public Optional<Output<String>> dataDiskType() {
        return Optional.ofNullable(this.dataDiskType);
    }

    /**
     * Disk encryption method used on the boot and data disks, defaults to GMEK.
     * Possible values are `DISK_ENCRYPTION_UNSPECIFIED`, `GMEK`, and `CMEK`.
     * 
     */
    @Import(name="diskEncryption")
    private @Nullable Output<String> diskEncryption;

    public Optional<Output<String>> diskEncryption() {
        return Optional.ofNullable(this.diskEncryption);
    }

    /**
     * Whether the end user authorizes Google Cloud to install GPU driver
     * on this instance. If this field is empty or set to false, the GPU driver
     * won&#39;t be installed. Only applicable to instances with GPUs.
     * 
     */
    @Import(name="installGpuDriver")
    private @Nullable Output<Boolean> installGpuDriver;

    public Optional<Output<Boolean>> installGpuDriver() {
        return Optional.ofNullable(this.installGpuDriver);
    }

    /**
     * The list of owners of this instance after creation.
     * Format: alias@example.com.
     * Currently supports one owner only.
     * If not specified, all of the service account users of
     * your VM instance&#39;s service account can use the instance.
     * 
     */
    @Import(name="instanceOwners")
    private @Nullable Output<List<String>> instanceOwners;

    public Optional<Output<List<String>>> instanceOwners() {
        return Optional.ofNullable(this.instanceOwners);
    }

    /**
     * The KMS key used to encrypt the disks, only applicable if diskEncryption is CMEK.
     * Format: projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * A reference to a machine type which defines VM kind.
     * 
     */
    @Import(name="machineType", required=true)
    private Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType;
    }

    /**
     * Custom metadata to apply to this instance.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name specified for the Notebook instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the VPC that this instance is in.
     * Format: projects/{project_id}/global/networks/{network_id}
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The type of vNIC driver.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    @Import(name="nicType")
    private @Nullable Output<String> nicType;

    public Optional<Output<String>> nicType() {
        return Optional.ofNullable(this.nicType);
    }

    /**
     * The notebook instance will not register with the proxy..
     * 
     */
    @Import(name="noProxyAccess")
    private @Nullable Output<Boolean> noProxyAccess;

    public Optional<Output<Boolean>> noProxyAccess() {
        return Optional.ofNullable(this.noProxyAccess);
    }

    /**
     * No public IP will be assigned to this instance.
     * 
     */
    @Import(name="noPublicIp")
    private @Nullable Output<Boolean> noPublicIp;

    public Optional<Output<Boolean>> noPublicIp() {
        return Optional.ofNullable(this.noPublicIp);
    }

    /**
     * If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    @Import(name="noRemoveDataDisk")
    private @Nullable Output<Boolean> noRemoveDataDisk;

    public Optional<Output<Boolean>> noRemoveDataDisk() {
        return Optional.ofNullable(this.noRemoveDataDisk);
    }

    /**
     * Path to a Bash script that automatically runs after a
     * notebook instance fully boots up. The path must be a URL
     * or Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    @Import(name="postStartupScript")
    private @Nullable Output<String> postStartupScript;

    public Optional<Output<String>> postStartupScript() {
        return Optional.ofNullable(this.postStartupScript);
    }

    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Reservation Affinity for consuming Zonal reservation.
     * Structure is documented below.
     * 
     */
    @Import(name="reservationAffinity")
    private @Nullable Output<InstanceReservationAffinityArgs> reservationAffinity;

    public Optional<Output<InstanceReservationAffinityArgs>> reservationAffinity() {
        return Optional.ofNullable(this.reservationAffinity);
    }

    /**
     * The service account on this instance, giving access to other
     * Google Cloud services. You can use any service account within
     * the same project, but you must have the service account user
     * permission to use the instance. If not specified,
     * the Compute Engine default service account is used.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances.
     * If not specified, the following scopes are defined:
     * - https://www.googleapis.com/auth/cloud-platform
     * - https://www.googleapis.com/auth/userinfo.email
     * 
     */
    @Import(name="serviceAccountScopes")
    private @Nullable Output<List<String>> serviceAccountScopes;

    public Optional<Output<List<String>>> serviceAccountScopes() {
        return Optional.ofNullable(this.serviceAccountScopes);
    }

    /**
     * A set of Shielded Instance options. Check [Images using supported Shielded VM features]
     * Not all combinations are valid
     * Structure is documented below.
     * 
     */
    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<InstanceShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Optional<Output<InstanceShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    /**
     * The name of the subnet that this instance is in.
     * Format: projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * The Compute Engine tags to add to instance.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Instance update time.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="vmImage")
    private @Nullable Output<InstanceVmImageArgs> vmImage;

    public Optional<Output<InstanceVmImageArgs>> vmImage() {
        return Optional.ofNullable(this.vmImage);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.acceleratorConfig = $.acceleratorConfig;
        this.bootDiskSizeGb = $.bootDiskSizeGb;
        this.bootDiskType = $.bootDiskType;
        this.containerImage = $.containerImage;
        this.createTime = $.createTime;
        this.customGpuDriverPath = $.customGpuDriverPath;
        this.dataDiskSizeGb = $.dataDiskSizeGb;
        this.dataDiskType = $.dataDiskType;
        this.diskEncryption = $.diskEncryption;
        this.installGpuDriver = $.installGpuDriver;
        this.instanceOwners = $.instanceOwners;
        this.kmsKey = $.kmsKey;
        this.labels = $.labels;
        this.location = $.location;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.name = $.name;
        this.network = $.network;
        this.nicType = $.nicType;
        this.noProxyAccess = $.noProxyAccess;
        this.noPublicIp = $.noPublicIp;
        this.noRemoveDataDisk = $.noRemoveDataDisk;
        this.postStartupScript = $.postStartupScript;
        this.project = $.project;
        this.reservationAffinity = $.reservationAffinity;
        this.serviceAccount = $.serviceAccount;
        this.serviceAccountScopes = $.serviceAccountScopes;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.subnet = $.subnet;
        this.tags = $.tags;
        this.updateTime = $.updateTime;
        this.vmImage = $.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder acceleratorConfig(@Nullable Output<InstanceAcceleratorConfigArgs> acceleratorConfig) {
            $.acceleratorConfig = acceleratorConfig;
            return this;
        }

        public Builder acceleratorConfig(InstanceAcceleratorConfigArgs acceleratorConfig) {
            return acceleratorConfig(Output.of(acceleratorConfig));
        }

        public Builder bootDiskSizeGb(@Nullable Output<Integer> bootDiskSizeGb) {
            $.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        public Builder bootDiskSizeGb(Integer bootDiskSizeGb) {
            return bootDiskSizeGb(Output.of(bootDiskSizeGb));
        }

        public Builder bootDiskType(@Nullable Output<String> bootDiskType) {
            $.bootDiskType = bootDiskType;
            return this;
        }

        public Builder bootDiskType(String bootDiskType) {
            return bootDiskType(Output.of(bootDiskType));
        }

        public Builder containerImage(@Nullable Output<InstanceContainerImageArgs> containerImage) {
            $.containerImage = containerImage;
            return this;
        }

        public Builder containerImage(InstanceContainerImageArgs containerImage) {
            return containerImage(Output.of(containerImage));
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        public Builder customGpuDriverPath(@Nullable Output<String> customGpuDriverPath) {
            $.customGpuDriverPath = customGpuDriverPath;
            return this;
        }

        public Builder customGpuDriverPath(String customGpuDriverPath) {
            return customGpuDriverPath(Output.of(customGpuDriverPath));
        }

        public Builder dataDiskSizeGb(@Nullable Output<Integer> dataDiskSizeGb) {
            $.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        public Builder dataDiskSizeGb(Integer dataDiskSizeGb) {
            return dataDiskSizeGb(Output.of(dataDiskSizeGb));
        }

        public Builder dataDiskType(@Nullable Output<String> dataDiskType) {
            $.dataDiskType = dataDiskType;
            return this;
        }

        public Builder dataDiskType(String dataDiskType) {
            return dataDiskType(Output.of(dataDiskType));
        }

        public Builder diskEncryption(@Nullable Output<String> diskEncryption) {
            $.diskEncryption = diskEncryption;
            return this;
        }

        public Builder diskEncryption(String diskEncryption) {
            return diskEncryption(Output.of(diskEncryption));
        }

        public Builder installGpuDriver(@Nullable Output<Boolean> installGpuDriver) {
            $.installGpuDriver = installGpuDriver;
            return this;
        }

        public Builder installGpuDriver(Boolean installGpuDriver) {
            return installGpuDriver(Output.of(installGpuDriver));
        }

        public Builder instanceOwners(@Nullable Output<List<String>> instanceOwners) {
            $.instanceOwners = instanceOwners;
            return this;
        }

        public Builder instanceOwners(List<String> instanceOwners) {
            return instanceOwners(Output.of(instanceOwners));
        }

        public Builder instanceOwners(String... instanceOwners) {
            return instanceOwners(List.of(instanceOwners));
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder machineType(Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder nicType(@Nullable Output<String> nicType) {
            $.nicType = nicType;
            return this;
        }

        public Builder nicType(String nicType) {
            return nicType(Output.of(nicType));
        }

        public Builder noProxyAccess(@Nullable Output<Boolean> noProxyAccess) {
            $.noProxyAccess = noProxyAccess;
            return this;
        }

        public Builder noProxyAccess(Boolean noProxyAccess) {
            return noProxyAccess(Output.of(noProxyAccess));
        }

        public Builder noPublicIp(@Nullable Output<Boolean> noPublicIp) {
            $.noPublicIp = noPublicIp;
            return this;
        }

        public Builder noPublicIp(Boolean noPublicIp) {
            return noPublicIp(Output.of(noPublicIp));
        }

        public Builder noRemoveDataDisk(@Nullable Output<Boolean> noRemoveDataDisk) {
            $.noRemoveDataDisk = noRemoveDataDisk;
            return this;
        }

        public Builder noRemoveDataDisk(Boolean noRemoveDataDisk) {
            return noRemoveDataDisk(Output.of(noRemoveDataDisk));
        }

        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            $.postStartupScript = postStartupScript;
            return this;
        }

        public Builder postStartupScript(String postStartupScript) {
            return postStartupScript(Output.of(postStartupScript));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder reservationAffinity(@Nullable Output<InstanceReservationAffinityArgs> reservationAffinity) {
            $.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder reservationAffinity(InstanceReservationAffinityArgs reservationAffinity) {
            return reservationAffinity(Output.of(reservationAffinity));
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public Builder serviceAccountScopes(@Nullable Output<List<String>> serviceAccountScopes) {
            $.serviceAccountScopes = serviceAccountScopes;
            return this;
        }

        public Builder serviceAccountScopes(List<String> serviceAccountScopes) {
            return serviceAccountScopes(Output.of(serviceAccountScopes));
        }

        public Builder serviceAccountScopes(String... serviceAccountScopes) {
            return serviceAccountScopes(List.of(serviceAccountScopes));
        }

        public Builder shieldedInstanceConfig(@Nullable Output<InstanceShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder shieldedInstanceConfig(InstanceShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public Builder vmImage(@Nullable Output<InstanceVmImageArgs> vmImage) {
            $.vmImage = vmImage;
            return this;
        }

        public Builder vmImage(InstanceVmImageArgs vmImage) {
            return vmImage(Output.of(vmImage));
        }

        public InstanceArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            return $;
        }
    }

}
