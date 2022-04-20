// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.FilterTrackSelectionResponse;
import com.pulumi.azurenative.media.outputs.FirstQualityResponse;
import com.pulumi.azurenative.media.outputs.PresentationTimeRangeResponse;
import com.pulumi.azurenative.media.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountFilterResult {
    /**
     * The first quality.
     * 
     */
    private final @Nullable FirstQualityResponse firstQuality;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The presentation time range.
     * 
     */
    private final @Nullable PresentationTimeRangeResponse presentationTimeRange;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The tracks selection conditions.
     * 
     */
    private final @Nullable List<FilterTrackSelectionResponse> tracks;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAccountFilterResult(
        @CustomType.Parameter("firstQuality") @Nullable FirstQualityResponse firstQuality,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("presentationTimeRange") @Nullable PresentationTimeRangeResponse presentationTimeRange,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tracks") @Nullable List<FilterTrackSelectionResponse> tracks,
        @CustomType.Parameter("type") String type) {
        this.firstQuality = firstQuality;
        this.id = id;
        this.name = name;
        this.presentationTimeRange = presentationTimeRange;
        this.systemData = systemData;
        this.tracks = tracks;
        this.type = type;
    }

    /**
     * The first quality.
     * 
    */
    public Optional<FirstQualityResponse> firstQuality() {
        return Optional.ofNullable(this.firstQuality);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The presentation time range.
     * 
    */
    public Optional<PresentationTimeRangeResponse> presentationTimeRange() {
        return Optional.ofNullable(this.presentationTimeRange);
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * The tracks selection conditions.
     * 
    */
    public List<FilterTrackSelectionResponse> tracks() {
        return this.tracks == null ? List.of() : this.tracks;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountFilterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirstQualityResponse firstQuality;
        private String id;
        private String name;
        private @Nullable PresentationTimeRangeResponse presentationTimeRange;
        private SystemDataResponse systemData;
        private @Nullable List<FilterTrackSelectionResponse> tracks;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountFilterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firstQuality = defaults.firstQuality;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.presentationTimeRange = defaults.presentationTimeRange;
    	      this.systemData = defaults.systemData;
    	      this.tracks = defaults.tracks;
    	      this.type = defaults.type;
        }

        public Builder firstQuality(@Nullable FirstQualityResponse firstQuality) {
            this.firstQuality = firstQuality;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder presentationTimeRange(@Nullable PresentationTimeRangeResponse presentationTimeRange) {
            this.presentationTimeRange = presentationTimeRange;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tracks(@Nullable List<FilterTrackSelectionResponse> tracks) {
            this.tracks = tracks;
            return this;
        }
        public Builder tracks(FilterTrackSelectionResponse... tracks) {
            return tracks(List.of(tracks));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAccountFilterResult build() {
            return new GetAccountFilterResult(firstQuality, id, name, presentationTimeRange, systemData, tracks, type);
        }
    }
}
