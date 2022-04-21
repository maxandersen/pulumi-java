// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.MasterTargetServerResponse;
import com.pulumi.azurenative.recoveryservices.inputs.ProcessServerResponse;
import com.pulumi.azurenative.recoveryservices.inputs.RunAsAccountResponse;
import com.pulumi.azurenative.recoveryservices.inputs.VersionDetailsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Store the fabric details specific to the VMware fabric.
 * 
 */
public final class VMwareDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VMwareDetailsResponse Empty = new VMwareDetailsResponse();

    /**
     * The number of source and target servers configured to talk to this CS.
     * 
     */
    @Import(name="agentCount")
    private @Nullable String agentCount;

    public Optional<String> agentCount() {
        return Optional.ofNullable(this.agentCount);
    }

    /**
     * Agent expiry date.
     * 
     */
    @Import(name="agentExpiryDate")
    private @Nullable String agentExpiryDate;

    public Optional<String> agentExpiryDate() {
        return Optional.ofNullable(this.agentExpiryDate);
    }

    /**
     * The agent Version.
     * 
     */
    @Import(name="agentVersion")
    private @Nullable String agentVersion;

    public Optional<String> agentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }

    /**
     * The agent version details.
     * 
     */
    @Import(name="agentVersionDetails")
    private @Nullable VersionDetailsResponse agentVersionDetails;

    public Optional<VersionDetailsResponse> agentVersionDetails() {
        return Optional.ofNullable(this.agentVersionDetails);
    }

    /**
     * The available memory.
     * 
     */
    @Import(name="availableMemoryInBytes")
    private @Nullable Double availableMemoryInBytes;

    public Optional<Double> availableMemoryInBytes() {
        return Optional.ofNullable(this.availableMemoryInBytes);
    }

    /**
     * The available space.
     * 
     */
    @Import(name="availableSpaceInBytes")
    private @Nullable Double availableSpaceInBytes;

    public Optional<Double> availableSpaceInBytes() {
        return Optional.ofNullable(this.availableSpaceInBytes);
    }

    /**
     * The percentage of the CPU load.
     * 
     */
    @Import(name="cpuLoad")
    private @Nullable String cpuLoad;

    public Optional<String> cpuLoad() {
        return Optional.ofNullable(this.cpuLoad);
    }

    /**
     * The CPU load status.
     * 
     */
    @Import(name="cpuLoadStatus")
    private @Nullable String cpuLoadStatus;

    public Optional<String> cpuLoadStatus() {
        return Optional.ofNullable(this.cpuLoadStatus);
    }

    /**
     * The CS service status.
     * 
     */
    @Import(name="csServiceStatus")
    private @Nullable String csServiceStatus;

    public Optional<String> csServiceStatus() {
        return Optional.ofNullable(this.csServiceStatus);
    }

    /**
     * The database server load.
     * 
     */
    @Import(name="databaseServerLoad")
    private @Nullable String databaseServerLoad;

    public Optional<String> databaseServerLoad() {
        return Optional.ofNullable(this.databaseServerLoad);
    }

    /**
     * The database server load status.
     * 
     */
    @Import(name="databaseServerLoadStatus")
    private @Nullable String databaseServerLoadStatus;

    public Optional<String> databaseServerLoadStatus() {
        return Optional.ofNullable(this.databaseServerLoadStatus);
    }

    /**
     * The host name.
     * 
     */
    @Import(name="hostName")
    private @Nullable String hostName;

    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is &#39;VMware&#39;.
     * 
     */
    @Import(name="instanceType", required=true)
    private String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * The IP address.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The last heartbeat received from CS server.
     * 
     */
    @Import(name="lastHeartbeat")
    private @Nullable String lastHeartbeat;

    public Optional<String> lastHeartbeat() {
        return Optional.ofNullable(this.lastHeartbeat);
    }

    /**
     * The list of Master Target servers associated with the fabric.
     * 
     */
    @Import(name="masterTargetServers")
    private @Nullable List<MasterTargetServerResponse> masterTargetServers;

    public Optional<List<MasterTargetServerResponse>> masterTargetServers() {
        return Optional.ofNullable(this.masterTargetServers);
    }

    /**
     * The memory usage status.
     * 
     */
    @Import(name="memoryUsageStatus")
    private @Nullable String memoryUsageStatus;

    public Optional<String> memoryUsageStatus() {
        return Optional.ofNullable(this.memoryUsageStatus);
    }

    /**
     * The number of process servers.
     * 
     */
    @Import(name="processServerCount")
    private @Nullable String processServerCount;

    public Optional<String> processServerCount() {
        return Optional.ofNullable(this.processServerCount);
    }

    /**
     * The list of Process Servers associated with the fabric.
     * 
     */
    @Import(name="processServers")
    private @Nullable List<ProcessServerResponse> processServers;

    public Optional<List<ProcessServerResponse>> processServers() {
        return Optional.ofNullable(this.processServers);
    }

    /**
     * The number of protected servers.
     * 
     */
    @Import(name="protectedServers")
    private @Nullable String protectedServers;

    public Optional<String> protectedServers() {
        return Optional.ofNullable(this.protectedServers);
    }

    /**
     * PS template version.
     * 
     */
    @Import(name="psTemplateVersion")
    private @Nullable String psTemplateVersion;

    public Optional<String> psTemplateVersion() {
        return Optional.ofNullable(this.psTemplateVersion);
    }

    /**
     * The number of replication pairs configured in this CS.
     * 
     */
    @Import(name="replicationPairCount")
    private @Nullable String replicationPairCount;

    public Optional<String> replicationPairCount() {
        return Optional.ofNullable(this.replicationPairCount);
    }

    /**
     * The list of run as accounts created on the server.
     * 
     */
    @Import(name="runAsAccounts")
    private @Nullable List<RunAsAccountResponse> runAsAccounts;

    public Optional<List<RunAsAccountResponse>> runAsAccounts() {
        return Optional.ofNullable(this.runAsAccounts);
    }

    /**
     * The space usage status.
     * 
     */
    @Import(name="spaceUsageStatus")
    private @Nullable String spaceUsageStatus;

    public Optional<String> spaceUsageStatus() {
        return Optional.ofNullable(this.spaceUsageStatus);
    }

    /**
     * CS SSL cert expiry date.
     * 
     */
    @Import(name="sslCertExpiryDate")
    private @Nullable String sslCertExpiryDate;

    public Optional<String> sslCertExpiryDate() {
        return Optional.ofNullable(this.sslCertExpiryDate);
    }

    /**
     * CS SSL cert expiry date.
     * 
     */
    @Import(name="sslCertExpiryRemainingDays")
    private @Nullable Integer sslCertExpiryRemainingDays;

    public Optional<Integer> sslCertExpiryRemainingDays() {
        return Optional.ofNullable(this.sslCertExpiryRemainingDays);
    }

    /**
     * The percentage of the system load.
     * 
     */
    @Import(name="systemLoad")
    private @Nullable String systemLoad;

    public Optional<String> systemLoad() {
        return Optional.ofNullable(this.systemLoad);
    }

    /**
     * The system load status.
     * 
     */
    @Import(name="systemLoadStatus")
    private @Nullable String systemLoadStatus;

    public Optional<String> systemLoadStatus() {
        return Optional.ofNullable(this.systemLoadStatus);
    }

    /**
     * The total memory.
     * 
     */
    @Import(name="totalMemoryInBytes")
    private @Nullable Double totalMemoryInBytes;

    public Optional<Double> totalMemoryInBytes() {
        return Optional.ofNullable(this.totalMemoryInBytes);
    }

    /**
     * The total space.
     * 
     */
    @Import(name="totalSpaceInBytes")
    private @Nullable Double totalSpaceInBytes;

    public Optional<Double> totalSpaceInBytes() {
        return Optional.ofNullable(this.totalSpaceInBytes);
    }

    /**
     * Version status
     * 
     */
    @Import(name="versionStatus")
    private @Nullable String versionStatus;

    public Optional<String> versionStatus() {
        return Optional.ofNullable(this.versionStatus);
    }

    /**
     * The web load.
     * 
     */
    @Import(name="webLoad")
    private @Nullable String webLoad;

    public Optional<String> webLoad() {
        return Optional.ofNullable(this.webLoad);
    }

    /**
     * The web load status.
     * 
     */
    @Import(name="webLoadStatus")
    private @Nullable String webLoadStatus;

    public Optional<String> webLoadStatus() {
        return Optional.ofNullable(this.webLoadStatus);
    }

    private VMwareDetailsResponse() {}

    private VMwareDetailsResponse(VMwareDetailsResponse $) {
        this.agentCount = $.agentCount;
        this.agentExpiryDate = $.agentExpiryDate;
        this.agentVersion = $.agentVersion;
        this.agentVersionDetails = $.agentVersionDetails;
        this.availableMemoryInBytes = $.availableMemoryInBytes;
        this.availableSpaceInBytes = $.availableSpaceInBytes;
        this.cpuLoad = $.cpuLoad;
        this.cpuLoadStatus = $.cpuLoadStatus;
        this.csServiceStatus = $.csServiceStatus;
        this.databaseServerLoad = $.databaseServerLoad;
        this.databaseServerLoadStatus = $.databaseServerLoadStatus;
        this.hostName = $.hostName;
        this.instanceType = $.instanceType;
        this.ipAddress = $.ipAddress;
        this.lastHeartbeat = $.lastHeartbeat;
        this.masterTargetServers = $.masterTargetServers;
        this.memoryUsageStatus = $.memoryUsageStatus;
        this.processServerCount = $.processServerCount;
        this.processServers = $.processServers;
        this.protectedServers = $.protectedServers;
        this.psTemplateVersion = $.psTemplateVersion;
        this.replicationPairCount = $.replicationPairCount;
        this.runAsAccounts = $.runAsAccounts;
        this.spaceUsageStatus = $.spaceUsageStatus;
        this.sslCertExpiryDate = $.sslCertExpiryDate;
        this.sslCertExpiryRemainingDays = $.sslCertExpiryRemainingDays;
        this.systemLoad = $.systemLoad;
        this.systemLoadStatus = $.systemLoadStatus;
        this.totalMemoryInBytes = $.totalMemoryInBytes;
        this.totalSpaceInBytes = $.totalSpaceInBytes;
        this.versionStatus = $.versionStatus;
        this.webLoad = $.webLoad;
        this.webLoadStatus = $.webLoadStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareDetailsResponse $;

        public Builder() {
            $ = new VMwareDetailsResponse();
        }

        public Builder(VMwareDetailsResponse defaults) {
            $ = new VMwareDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder agentCount(@Nullable String agentCount) {
            $.agentCount = agentCount;
            return this;
        }

        public Builder agentExpiryDate(@Nullable String agentExpiryDate) {
            $.agentExpiryDate = agentExpiryDate;
            return this;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            $.agentVersion = agentVersion;
            return this;
        }

        public Builder agentVersionDetails(@Nullable VersionDetailsResponse agentVersionDetails) {
            $.agentVersionDetails = agentVersionDetails;
            return this;
        }

        public Builder availableMemoryInBytes(@Nullable Double availableMemoryInBytes) {
            $.availableMemoryInBytes = availableMemoryInBytes;
            return this;
        }

        public Builder availableSpaceInBytes(@Nullable Double availableSpaceInBytes) {
            $.availableSpaceInBytes = availableSpaceInBytes;
            return this;
        }

        public Builder cpuLoad(@Nullable String cpuLoad) {
            $.cpuLoad = cpuLoad;
            return this;
        }

        public Builder cpuLoadStatus(@Nullable String cpuLoadStatus) {
            $.cpuLoadStatus = cpuLoadStatus;
            return this;
        }

        public Builder csServiceStatus(@Nullable String csServiceStatus) {
            $.csServiceStatus = csServiceStatus;
            return this;
        }

        public Builder databaseServerLoad(@Nullable String databaseServerLoad) {
            $.databaseServerLoad = databaseServerLoad;
            return this;
        }

        public Builder databaseServerLoadStatus(@Nullable String databaseServerLoadStatus) {
            $.databaseServerLoadStatus = databaseServerLoadStatus;
            return this;
        }

        public Builder hostName(@Nullable String hostName) {
            $.hostName = hostName;
            return this;
        }

        public Builder instanceType(String instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder lastHeartbeat(@Nullable String lastHeartbeat) {
            $.lastHeartbeat = lastHeartbeat;
            return this;
        }

        public Builder masterTargetServers(@Nullable List<MasterTargetServerResponse> masterTargetServers) {
            $.masterTargetServers = masterTargetServers;
            return this;
        }

        public Builder masterTargetServers(MasterTargetServerResponse... masterTargetServers) {
            return masterTargetServers(List.of(masterTargetServers));
        }

        public Builder memoryUsageStatus(@Nullable String memoryUsageStatus) {
            $.memoryUsageStatus = memoryUsageStatus;
            return this;
        }

        public Builder processServerCount(@Nullable String processServerCount) {
            $.processServerCount = processServerCount;
            return this;
        }

        public Builder processServers(@Nullable List<ProcessServerResponse> processServers) {
            $.processServers = processServers;
            return this;
        }

        public Builder processServers(ProcessServerResponse... processServers) {
            return processServers(List.of(processServers));
        }

        public Builder protectedServers(@Nullable String protectedServers) {
            $.protectedServers = protectedServers;
            return this;
        }

        public Builder psTemplateVersion(@Nullable String psTemplateVersion) {
            $.psTemplateVersion = psTemplateVersion;
            return this;
        }

        public Builder replicationPairCount(@Nullable String replicationPairCount) {
            $.replicationPairCount = replicationPairCount;
            return this;
        }

        public Builder runAsAccounts(@Nullable List<RunAsAccountResponse> runAsAccounts) {
            $.runAsAccounts = runAsAccounts;
            return this;
        }

        public Builder runAsAccounts(RunAsAccountResponse... runAsAccounts) {
            return runAsAccounts(List.of(runAsAccounts));
        }

        public Builder spaceUsageStatus(@Nullable String spaceUsageStatus) {
            $.spaceUsageStatus = spaceUsageStatus;
            return this;
        }

        public Builder sslCertExpiryDate(@Nullable String sslCertExpiryDate) {
            $.sslCertExpiryDate = sslCertExpiryDate;
            return this;
        }

        public Builder sslCertExpiryRemainingDays(@Nullable Integer sslCertExpiryRemainingDays) {
            $.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
            return this;
        }

        public Builder systemLoad(@Nullable String systemLoad) {
            $.systemLoad = systemLoad;
            return this;
        }

        public Builder systemLoadStatus(@Nullable String systemLoadStatus) {
            $.systemLoadStatus = systemLoadStatus;
            return this;
        }

        public Builder totalMemoryInBytes(@Nullable Double totalMemoryInBytes) {
            $.totalMemoryInBytes = totalMemoryInBytes;
            return this;
        }

        public Builder totalSpaceInBytes(@Nullable Double totalSpaceInBytes) {
            $.totalSpaceInBytes = totalSpaceInBytes;
            return this;
        }

        public Builder versionStatus(@Nullable String versionStatus) {
            $.versionStatus = versionStatus;
            return this;
        }

        public Builder webLoad(@Nullable String webLoad) {
            $.webLoad = webLoad;
            return this;
        }

        public Builder webLoadStatus(@Nullable String webLoadStatus) {
            $.webLoadStatus = webLoadStatus;
            return this;
        }

        public VMwareDetailsResponse build() {
            $.instanceType = Codegen.stringProp("instanceType").arg($.instanceType).require();
            return $;
        }
    }

}
