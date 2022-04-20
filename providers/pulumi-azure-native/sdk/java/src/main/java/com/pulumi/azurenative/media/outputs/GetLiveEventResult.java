// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.CrossSiteAccessPoliciesResponse;
import com.pulumi.azurenative.media.outputs.LiveEventEncodingResponse;
import com.pulumi.azurenative.media.outputs.LiveEventInputResponse;
import com.pulumi.azurenative.media.outputs.LiveEventPreviewResponse;
import com.pulumi.azurenative.media.outputs.LiveEventTranscriptionResponse;
import com.pulumi.azurenative.media.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLiveEventResult {
    /**
     * The creation time for the live event
     * 
     */
    private final String created;
    /**
     * Live event cross site access policies.
     * 
     */
    private final @Nullable CrossSiteAccessPoliciesResponse crossSiteAccessPolicies;
    /**
     * A description for the live event.
     * 
     */
    private final @Nullable String description;
    /**
     * Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     * 
     */
    private final @Nullable LiveEventEncodingResponse encoding;
    /**
     * When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     * 
     */
    private final @Nullable String hostnamePrefix;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Live event input settings. It defines how the live event receives input from a contribution encoder.
     * 
     */
    private final LiveEventInputResponse input;
    /**
     * The last modified time of the live event.
     * 
     */
    private final String lastModified;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     * 
     */
    private final @Nullable LiveEventPreviewResponse preview;
    /**
     * The provisioning state of the live event.
     * 
     */
    private final String provisioningState;
    /**
     * The resource state of the live event. See https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     * 
     */
    private final String resourceState;
    /**
     * The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are &#39;Default&#39; and &#39;LowLatency&#39;.
     * 
     */
    private final @Nullable List<String> streamOptions;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     * 
     */
    private final @Nullable List<LiveEventTranscriptionResponse> transcriptions;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state
     * 
     */
    private final @Nullable Boolean useStaticHostname;

    @CustomType.Constructor
    private GetLiveEventResult(
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("crossSiteAccessPolicies") @Nullable CrossSiteAccessPoliciesResponse crossSiteAccessPolicies,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encoding") @Nullable LiveEventEncodingResponse encoding,
        @CustomType.Parameter("hostnamePrefix") @Nullable String hostnamePrefix,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("input") LiveEventInputResponse input,
        @CustomType.Parameter("lastModified") String lastModified,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("preview") @Nullable LiveEventPreviewResponse preview,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("streamOptions") @Nullable List<String> streamOptions,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("transcriptions") @Nullable List<LiveEventTranscriptionResponse> transcriptions,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useStaticHostname") @Nullable Boolean useStaticHostname) {
        this.created = created;
        this.crossSiteAccessPolicies = crossSiteAccessPolicies;
        this.description = description;
        this.encoding = encoding;
        this.hostnamePrefix = hostnamePrefix;
        this.id = id;
        this.input = input;
        this.lastModified = lastModified;
        this.location = location;
        this.name = name;
        this.preview = preview;
        this.provisioningState = provisioningState;
        this.resourceState = resourceState;
        this.streamOptions = streamOptions;
        this.systemData = systemData;
        this.tags = tags;
        this.transcriptions = transcriptions;
        this.type = type;
        this.useStaticHostname = useStaticHostname;
    }

    /**
     * The creation time for the live event
     * 
    */
    public String created() {
        return this.created;
    }
    /**
     * Live event cross site access policies.
     * 
    */
    public Optional<CrossSiteAccessPoliciesResponse> crossSiteAccessPolicies() {
        return Optional.ofNullable(this.crossSiteAccessPolicies);
    }
    /**
     * A description for the live event.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     * 
    */
    public Optional<LiveEventEncodingResponse> encoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     * 
    */
    public Optional<String> hostnamePrefix() {
        return Optional.ofNullable(this.hostnamePrefix);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Live event input settings. It defines how the live event receives input from a contribution encoder.
     * 
    */
    public LiveEventInputResponse input() {
        return this.input;
    }
    /**
     * The last modified time of the live event.
     * 
    */
    public String lastModified() {
        return this.lastModified;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     * 
    */
    public Optional<LiveEventPreviewResponse> preview() {
        return Optional.ofNullable(this.preview);
    }
    /**
     * The provisioning state of the live event.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource state of the live event. See https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     * 
    */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are &#39;Default&#39; and &#39;LowLatency&#39;.
     * 
    */
    public List<String> streamOptions() {
        return this.streamOptions == null ? List.of() : this.streamOptions;
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     * 
    */
    public List<LiveEventTranscriptionResponse> transcriptions() {
        return this.transcriptions == null ? List.of() : this.transcriptions;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state
     * 
    */
    public Optional<Boolean> useStaticHostname() {
        return Optional.ofNullable(this.useStaticHostname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveEventResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private @Nullable CrossSiteAccessPoliciesResponse crossSiteAccessPolicies;
        private @Nullable String description;
        private @Nullable LiveEventEncodingResponse encoding;
        private @Nullable String hostnamePrefix;
        private String id;
        private LiveEventInputResponse input;
        private String lastModified;
        private String location;
        private String name;
        private @Nullable LiveEventPreviewResponse preview;
        private String provisioningState;
        private String resourceState;
        private @Nullable List<String> streamOptions;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable List<LiveEventTranscriptionResponse> transcriptions;
        private String type;
        private @Nullable Boolean useStaticHostname;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLiveEventResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.crossSiteAccessPolicies = defaults.crossSiteAccessPolicies;
    	      this.description = defaults.description;
    	      this.encoding = defaults.encoding;
    	      this.hostnamePrefix = defaults.hostnamePrefix;
    	      this.id = defaults.id;
    	      this.input = defaults.input;
    	      this.lastModified = defaults.lastModified;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.preview = defaults.preview;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.streamOptions = defaults.streamOptions;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.transcriptions = defaults.transcriptions;
    	      this.type = defaults.type;
    	      this.useStaticHostname = defaults.useStaticHostname;
        }

        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder crossSiteAccessPolicies(@Nullable CrossSiteAccessPoliciesResponse crossSiteAccessPolicies) {
            this.crossSiteAccessPolicies = crossSiteAccessPolicies;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encoding(@Nullable LiveEventEncodingResponse encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder hostnamePrefix(@Nullable String hostnamePrefix) {
            this.hostnamePrefix = hostnamePrefix;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder input(LiveEventInputResponse input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }
        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder preview(@Nullable LiveEventPreviewResponse preview) {
            this.preview = preview;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder streamOptions(@Nullable List<String> streamOptions) {
            this.streamOptions = streamOptions;
            return this;
        }
        public Builder streamOptions(String... streamOptions) {
            return streamOptions(List.of(streamOptions));
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder transcriptions(@Nullable List<LiveEventTranscriptionResponse> transcriptions) {
            this.transcriptions = transcriptions;
            return this;
        }
        public Builder transcriptions(LiveEventTranscriptionResponse... transcriptions) {
            return transcriptions(List.of(transcriptions));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useStaticHostname(@Nullable Boolean useStaticHostname) {
            this.useStaticHostname = useStaticHostname;
            return this;
        }        public GetLiveEventResult build() {
            return new GetLiveEventResult(created, crossSiteAccessPolicies, description, encoding, hostnamePrefix, id, input, lastModified, location, name, preview, provisioningState, resourceState, streamOptions, systemData, tags, transcriptions, type, useStaticHostname);
        }
    }
}
