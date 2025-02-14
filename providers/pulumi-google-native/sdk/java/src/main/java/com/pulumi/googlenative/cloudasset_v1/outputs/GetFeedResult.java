// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudasset_v1.outputs.ExprResponse;
import com.pulumi.googlenative.cloudasset_v1.outputs.FeedOutputConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFeedResult {
    /**
     * @return A list of the full names of the assets to receive updates. You must specify either or both of asset_names and asset_types. Only asset updates matching specified asset_names or asset_types are exported to the feed. Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. For a list of the full names for supported asset types, see [Resource name format](/asset-inventory/docs/resource-name-format).
     * 
     */
    private final List<String> assetNames;
    /**
     * @return A list of types of the assets to receive updates. You must specify either or both of asset_names and asset_types. Only asset updates matching specified asset_names or asset_types are exported to the feed. Example: `&#34;compute.googleapis.com/Disk&#34;` For a list of all supported asset types, see [Supported asset types](/asset-inventory/docs/supported-asset-types).
     * 
     */
    private final List<String> assetTypes;
    /**
     * @return A condition which determines whether an asset update should be published. If specified, an asset will be returned only when the expression evaluates to true. When set, `expression` field in the `Expr` must be a valid [CEL expression] (https://github.com/google/cel-spec) on a TemporalAsset with name `temporal_asset`. Example: a Feed with expression (&#34;temporal_asset.deleted == true&#34;) will only publish Asset deletions. Other fields of `Expr` are optional. See our [user guide](https://cloud.google.com/asset-inventory/docs/monitoring-asset-changes-with-condition) for detailed instructions.
     * 
     */
    private final ExprResponse condition;
    /**
     * @return Asset content type. If not specified, no content but the asset name and type will be returned.
     * 
     */
    private final String contentType;
    /**
     * @return Feed output configuration defining where the asset updates are published to.
     * 
     */
    private final FeedOutputConfigResponse feedOutputConfig;
    /**
     * @return The format will be projects/{project_number}/feeds/{client-assigned_feed_identifier} or folders/{folder_number}/feeds/{client-assigned_feed_identifier} or organizations/{organization_number}/feeds/{client-assigned_feed_identifier} The client-assigned feed identifier must be unique within the parent project/folder/organization.
     * 
     */
    private final String name;
    /**
     * @return A list of relationship types to output, for example: `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if content_type=RELATIONSHIP. * If specified: it outputs specified relationship updates on the [asset_names] or the [asset_types]. It returns an error if any of the [relationship_types] doesn&#39;t belong to the supported relationship types of the [asset_names] or [asset_types], or any of the [asset_names] or the [asset_types] doesn&#39;t belong to the source types of the [relationship_types]. * Otherwise: it outputs the supported relationships of the types of [asset_names] and [asset_types] or returns an error if any of the [asset_names] or the [asset_types] has no replationship support. See [Introduction to Cloud Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported asset types and relationship types.
     * 
     */
    private final List<String> relationshipTypes;

    @CustomType.Constructor
    private GetFeedResult(
        @CustomType.Parameter("assetNames") List<String> assetNames,
        @CustomType.Parameter("assetTypes") List<String> assetTypes,
        @CustomType.Parameter("condition") ExprResponse condition,
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("feedOutputConfig") FeedOutputConfigResponse feedOutputConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("relationshipTypes") List<String> relationshipTypes) {
        this.assetNames = assetNames;
        this.assetTypes = assetTypes;
        this.condition = condition;
        this.contentType = contentType;
        this.feedOutputConfig = feedOutputConfig;
        this.name = name;
        this.relationshipTypes = relationshipTypes;
    }

    /**
     * @return A list of the full names of the assets to receive updates. You must specify either or both of asset_names and asset_types. Only asset updates matching specified asset_names or asset_types are exported to the feed. Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. For a list of the full names for supported asset types, see [Resource name format](/asset-inventory/docs/resource-name-format).
     * 
     */
    public List<String> assetNames() {
        return this.assetNames;
    }
    /**
     * @return A list of types of the assets to receive updates. You must specify either or both of asset_names and asset_types. Only asset updates matching specified asset_names or asset_types are exported to the feed. Example: `&#34;compute.googleapis.com/Disk&#34;` For a list of all supported asset types, see [Supported asset types](/asset-inventory/docs/supported-asset-types).
     * 
     */
    public List<String> assetTypes() {
        return this.assetTypes;
    }
    /**
     * @return A condition which determines whether an asset update should be published. If specified, an asset will be returned only when the expression evaluates to true. When set, `expression` field in the `Expr` must be a valid [CEL expression] (https://github.com/google/cel-spec) on a TemporalAsset with name `temporal_asset`. Example: a Feed with expression (&#34;temporal_asset.deleted == true&#34;) will only publish Asset deletions. Other fields of `Expr` are optional. See our [user guide](https://cloud.google.com/asset-inventory/docs/monitoring-asset-changes-with-condition) for detailed instructions.
     * 
     */
    public ExprResponse condition() {
        return this.condition;
    }
    /**
     * @return Asset content type. If not specified, no content but the asset name and type will be returned.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return Feed output configuration defining where the asset updates are published to.
     * 
     */
    public FeedOutputConfigResponse feedOutputConfig() {
        return this.feedOutputConfig;
    }
    /**
     * @return The format will be projects/{project_number}/feeds/{client-assigned_feed_identifier} or folders/{folder_number}/feeds/{client-assigned_feed_identifier} or organizations/{organization_number}/feeds/{client-assigned_feed_identifier} The client-assigned feed identifier must be unique within the parent project/folder/organization.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of relationship types to output, for example: `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if content_type=RELATIONSHIP. * If specified: it outputs specified relationship updates on the [asset_names] or the [asset_types]. It returns an error if any of the [relationship_types] doesn&#39;t belong to the supported relationship types of the [asset_names] or [asset_types], or any of the [asset_names] or the [asset_types] doesn&#39;t belong to the source types of the [relationship_types]. * Otherwise: it outputs the supported relationships of the types of [asset_names] and [asset_types] or returns an error if any of the [asset_names] or the [asset_types] has no replationship support. See [Introduction to Cloud Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported asset types and relationship types.
     * 
     */
    public List<String> relationshipTypes() {
        return this.relationshipTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeedResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> assetNames;
        private List<String> assetTypes;
        private ExprResponse condition;
        private String contentType;
        private FeedOutputConfigResponse feedOutputConfig;
        private String name;
        private List<String> relationshipTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFeedResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetNames = defaults.assetNames;
    	      this.assetTypes = defaults.assetTypes;
    	      this.condition = defaults.condition;
    	      this.contentType = defaults.contentType;
    	      this.feedOutputConfig = defaults.feedOutputConfig;
    	      this.name = defaults.name;
    	      this.relationshipTypes = defaults.relationshipTypes;
        }

        public Builder assetNames(List<String> assetNames) {
            this.assetNames = Objects.requireNonNull(assetNames);
            return this;
        }
        public Builder assetNames(String... assetNames) {
            return assetNames(List.of(assetNames));
        }
        public Builder assetTypes(List<String> assetTypes) {
            this.assetTypes = Objects.requireNonNull(assetTypes);
            return this;
        }
        public Builder assetTypes(String... assetTypes) {
            return assetTypes(List.of(assetTypes));
        }
        public Builder condition(ExprResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder feedOutputConfig(FeedOutputConfigResponse feedOutputConfig) {
            this.feedOutputConfig = Objects.requireNonNull(feedOutputConfig);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder relationshipTypes(List<String> relationshipTypes) {
            this.relationshipTypes = Objects.requireNonNull(relationshipTypes);
            return this;
        }
        public Builder relationshipTypes(String... relationshipTypes) {
            return relationshipTypes(List.of(relationshipTypes));
        }        public GetFeedResult build() {
            return new GetFeedResult(assetNames, assetTypes, condition, contentType, feedOutputConfig, name, relationshipTypes);
        }
    }
}
