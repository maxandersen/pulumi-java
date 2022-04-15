// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.LinkedIntegrationRuntimeResponse;
import io.pulumi.azurenative.synapse.inputs.SelfHostedIntegrationRuntimeNodeResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Self-hosted integration runtime status.
 * 
 */
public final class SelfHostedIntegrationRuntimeStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final SelfHostedIntegrationRuntimeStatusResponse Empty = new SelfHostedIntegrationRuntimeStatusResponse();

    /**
     * Whether Self-hosted integration runtime auto update has been turned on.
     * 
     */
    @Import(name="autoUpdate", required=true)
      private final String autoUpdate;

    public String autoUpdate() {
        return this.autoUpdate;
    }

    /**
     * The estimated time when the self-hosted integration runtime will be updated.
     * 
     */
    @Import(name="autoUpdateETA", required=true)
      private final String autoUpdateETA;

    public String autoUpdateETA() {
        return this.autoUpdateETA;
    }

    /**
     * Object with additional information about integration runtime capabilities.
     * 
     */
    @Import(name="capabilities", required=true)
      private final Map<String,String> capabilities;

    public Map<String,String> capabilities() {
        return this.capabilities;
    }

    /**
     * The time at which the integration runtime was created, in ISO8601 format.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * The workspace name which the integration runtime belong to.
     * 
     */
    @Import(name="dataFactoryName", required=true)
      private final String dataFactoryName;

    public String dataFactoryName() {
        return this.dataFactoryName;
    }

    /**
     * It is used to set the encryption mode for node-node communication channel (when more than 2 self-hosted integration runtime nodes exist).
     * 
     */
    @Import(name="internalChannelEncryption", required=true)
      private final String internalChannelEncryption;

    public String internalChannelEncryption() {
        return this.internalChannelEncryption;
    }

    /**
     * The latest version on download center.
     * 
     */
    @Import(name="latestVersion", required=true)
      private final String latestVersion;

    public String latestVersion() {
        return this.latestVersion;
    }

    /**
     * The list of linked integration runtimes that are created to share with this integration runtime.
     * 
     */
    @Import(name="links")
      private final @Nullable List<LinkedIntegrationRuntimeResponse> links;

    public List<LinkedIntegrationRuntimeResponse> links() {
        return this.links == null ? List.of() : this.links;
    }

    /**
     * The local time zone offset in hours.
     * 
     */
    @Import(name="localTimeZoneOffset", required=true)
      private final String localTimeZoneOffset;

    public String localTimeZoneOffset() {
        return this.localTimeZoneOffset;
    }

    /**
     * The node communication Channel encryption mode
     * 
     */
    @Import(name="nodeCommunicationChannelEncryptionMode", required=true)
      private final String nodeCommunicationChannelEncryptionMode;

    public String nodeCommunicationChannelEncryptionMode() {
        return this.nodeCommunicationChannelEncryptionMode;
    }

    /**
     * The list of nodes for this integration runtime.
     * 
     */
    @Import(name="nodes")
      private final @Nullable List<SelfHostedIntegrationRuntimeNodeResponse> nodes;

    public List<SelfHostedIntegrationRuntimeNodeResponse> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }

    /**
     * The version that the integration runtime is going to update to.
     * 
     */
    @Import(name="pushedVersion", required=true)
      private final String pushedVersion;

    public String pushedVersion() {
        return this.pushedVersion;
    }

    /**
     * The date at which the integration runtime will be scheduled to update, in ISO8601 format.
     * 
     */
    @Import(name="scheduledUpdateDate", required=true)
      private final String scheduledUpdateDate;

    public String scheduledUpdateDate() {
        return this.scheduledUpdateDate;
    }

    /**
     * The URLs for the services used in integration runtime backend service.
     * 
     */
    @Import(name="serviceUrls", required=true)
      private final List<String> serviceUrls;

    public List<String> serviceUrls() {
        return this.serviceUrls;
    }

    /**
     * The state of integration runtime.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * The task queue id of the integration runtime.
     * 
     */
    @Import(name="taskQueueId", required=true)
      private final String taskQueueId;

    public String taskQueueId() {
        return this.taskQueueId;
    }

    /**
     * The type of integration runtime.
     * Expected value is 'SelfHosted'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The time in the date scheduled by service to update the integration runtime, e.g., PT03H is 3 hours
     * 
     */
    @Import(name="updateDelayOffset", required=true)
      private final String updateDelayOffset;

    public String updateDelayOffset() {
        return this.updateDelayOffset;
    }

    /**
     * Version of the integration runtime.
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String version() {
        return this.version;
    }

    /**
     * Status of the integration runtime version.
     * 
     */
    @Import(name="versionStatus", required=true)
      private final String versionStatus;

    public String versionStatus() {
        return this.versionStatus;
    }

    public SelfHostedIntegrationRuntimeStatusResponse(
        String autoUpdate,
        String autoUpdateETA,
        Map<String,String> capabilities,
        String createTime,
        String dataFactoryName,
        String internalChannelEncryption,
        String latestVersion,
        @Nullable List<LinkedIntegrationRuntimeResponse> links,
        String localTimeZoneOffset,
        String nodeCommunicationChannelEncryptionMode,
        @Nullable List<SelfHostedIntegrationRuntimeNodeResponse> nodes,
        String pushedVersion,
        String scheduledUpdateDate,
        List<String> serviceUrls,
        String state,
        String taskQueueId,
        String type,
        String updateDelayOffset,
        String version,
        String versionStatus) {
        this.autoUpdate = Objects.requireNonNull(autoUpdate, "expected parameter 'autoUpdate' to be non-null");
        this.autoUpdateETA = Objects.requireNonNull(autoUpdateETA, "expected parameter 'autoUpdateETA' to be non-null");
        this.capabilities = Objects.requireNonNull(capabilities, "expected parameter 'capabilities' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.dataFactoryName = Objects.requireNonNull(dataFactoryName, "expected parameter 'dataFactoryName' to be non-null");
        this.internalChannelEncryption = Objects.requireNonNull(internalChannelEncryption, "expected parameter 'internalChannelEncryption' to be non-null");
        this.latestVersion = Objects.requireNonNull(latestVersion, "expected parameter 'latestVersion' to be non-null");
        this.links = links;
        this.localTimeZoneOffset = Objects.requireNonNull(localTimeZoneOffset, "expected parameter 'localTimeZoneOffset' to be non-null");
        this.nodeCommunicationChannelEncryptionMode = Objects.requireNonNull(nodeCommunicationChannelEncryptionMode, "expected parameter 'nodeCommunicationChannelEncryptionMode' to be non-null");
        this.nodes = nodes;
        this.pushedVersion = Objects.requireNonNull(pushedVersion, "expected parameter 'pushedVersion' to be non-null");
        this.scheduledUpdateDate = Objects.requireNonNull(scheduledUpdateDate, "expected parameter 'scheduledUpdateDate' to be non-null");
        this.serviceUrls = Objects.requireNonNull(serviceUrls, "expected parameter 'serviceUrls' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.taskQueueId = Objects.requireNonNull(taskQueueId, "expected parameter 'taskQueueId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.updateDelayOffset = Objects.requireNonNull(updateDelayOffset, "expected parameter 'updateDelayOffset' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
        this.versionStatus = Objects.requireNonNull(versionStatus, "expected parameter 'versionStatus' to be non-null");
    }

    private SelfHostedIntegrationRuntimeStatusResponse() {
        this.autoUpdate = null;
        this.autoUpdateETA = null;
        this.capabilities = Map.of();
        this.createTime = null;
        this.dataFactoryName = null;
        this.internalChannelEncryption = null;
        this.latestVersion = null;
        this.links = List.of();
        this.localTimeZoneOffset = null;
        this.nodeCommunicationChannelEncryptionMode = null;
        this.nodes = List.of();
        this.pushedVersion = null;
        this.scheduledUpdateDate = null;
        this.serviceUrls = List.of();
        this.state = null;
        this.taskQueueId = null;
        this.type = null;
        this.updateDelayOffset = null;
        this.version = null;
        this.versionStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfHostedIntegrationRuntimeStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoUpdate;
        private String autoUpdateETA;
        private Map<String,String> capabilities;
        private String createTime;
        private String dataFactoryName;
        private String internalChannelEncryption;
        private String latestVersion;
        private @Nullable List<LinkedIntegrationRuntimeResponse> links;
        private String localTimeZoneOffset;
        private String nodeCommunicationChannelEncryptionMode;
        private @Nullable List<SelfHostedIntegrationRuntimeNodeResponse> nodes;
        private String pushedVersion;
        private String scheduledUpdateDate;
        private List<String> serviceUrls;
        private String state;
        private String taskQueueId;
        private String type;
        private String updateDelayOffset;
        private String version;
        private String versionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfHostedIntegrationRuntimeStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpdate = defaults.autoUpdate;
    	      this.autoUpdateETA = defaults.autoUpdateETA;
    	      this.capabilities = defaults.capabilities;
    	      this.createTime = defaults.createTime;
    	      this.dataFactoryName = defaults.dataFactoryName;
    	      this.internalChannelEncryption = defaults.internalChannelEncryption;
    	      this.latestVersion = defaults.latestVersion;
    	      this.links = defaults.links;
    	      this.localTimeZoneOffset = defaults.localTimeZoneOffset;
    	      this.nodeCommunicationChannelEncryptionMode = defaults.nodeCommunicationChannelEncryptionMode;
    	      this.nodes = defaults.nodes;
    	      this.pushedVersion = defaults.pushedVersion;
    	      this.scheduledUpdateDate = defaults.scheduledUpdateDate;
    	      this.serviceUrls = defaults.serviceUrls;
    	      this.state = defaults.state;
    	      this.taskQueueId = defaults.taskQueueId;
    	      this.type = defaults.type;
    	      this.updateDelayOffset = defaults.updateDelayOffset;
    	      this.version = defaults.version;
    	      this.versionStatus = defaults.versionStatus;
        }

        public Builder autoUpdate(String autoUpdate) {
            this.autoUpdate = Objects.requireNonNull(autoUpdate);
            return this;
        }
        public Builder autoUpdateETA(String autoUpdateETA) {
            this.autoUpdateETA = Objects.requireNonNull(autoUpdateETA);
            return this;
        }
        public Builder capabilities(Map<String,String> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder dataFactoryName(String dataFactoryName) {
            this.dataFactoryName = Objects.requireNonNull(dataFactoryName);
            return this;
        }
        public Builder internalChannelEncryption(String internalChannelEncryption) {
            this.internalChannelEncryption = Objects.requireNonNull(internalChannelEncryption);
            return this;
        }
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = Objects.requireNonNull(latestVersion);
            return this;
        }
        public Builder links(@Nullable List<LinkedIntegrationRuntimeResponse> links) {
            this.links = links;
            return this;
        }
        public Builder links(LinkedIntegrationRuntimeResponse... links) {
            return links(List.of(links));
        }
        public Builder localTimeZoneOffset(String localTimeZoneOffset) {
            this.localTimeZoneOffset = Objects.requireNonNull(localTimeZoneOffset);
            return this;
        }
        public Builder nodeCommunicationChannelEncryptionMode(String nodeCommunicationChannelEncryptionMode) {
            this.nodeCommunicationChannelEncryptionMode = Objects.requireNonNull(nodeCommunicationChannelEncryptionMode);
            return this;
        }
        public Builder nodes(@Nullable List<SelfHostedIntegrationRuntimeNodeResponse> nodes) {
            this.nodes = nodes;
            return this;
        }
        public Builder nodes(SelfHostedIntegrationRuntimeNodeResponse... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder pushedVersion(String pushedVersion) {
            this.pushedVersion = Objects.requireNonNull(pushedVersion);
            return this;
        }
        public Builder scheduledUpdateDate(String scheduledUpdateDate) {
            this.scheduledUpdateDate = Objects.requireNonNull(scheduledUpdateDate);
            return this;
        }
        public Builder serviceUrls(List<String> serviceUrls) {
            this.serviceUrls = Objects.requireNonNull(serviceUrls);
            return this;
        }
        public Builder serviceUrls(String... serviceUrls) {
            return serviceUrls(List.of(serviceUrls));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder taskQueueId(String taskQueueId) {
            this.taskQueueId = Objects.requireNonNull(taskQueueId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateDelayOffset(String updateDelayOffset) {
            this.updateDelayOffset = Objects.requireNonNull(updateDelayOffset);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder versionStatus(String versionStatus) {
            this.versionStatus = Objects.requireNonNull(versionStatus);
            return this;
        }        public SelfHostedIntegrationRuntimeStatusResponse build() {
            return new SelfHostedIntegrationRuntimeStatusResponse(autoUpdate, autoUpdateETA, capabilities, createTime, dataFactoryName, internalChannelEncryption, latestVersion, links, localTimeZoneOffset, nodeCommunicationChannelEncryptionMode, nodes, pushedVersion, scheduledUpdateDate, serviceUrls, state, taskQueueId, type, updateDelayOffset, version, versionStatus);
        }
    }
}
