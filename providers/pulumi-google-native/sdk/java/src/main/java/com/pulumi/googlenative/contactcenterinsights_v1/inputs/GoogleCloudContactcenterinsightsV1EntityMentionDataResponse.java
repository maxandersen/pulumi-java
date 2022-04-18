// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1SentimentDataResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The data for an entity mention annotation. This represents a mention of an `Entity` in the conversation.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1EntityMentionDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1EntityMentionDataResponse Empty = new GoogleCloudContactcenterinsightsV1EntityMentionDataResponse();

    /**
     * The key of this entity in conversation entities. Can be used to retrieve the exact `Entity` this mention is attached to.
     * 
     */
    @Import(name="entityUniqueId", required=true)
      private final String entityUniqueId;

    public String entityUniqueId() {
        return this.entityUniqueId;
    }

    /**
     * Sentiment expressed for this mention of the entity.
     * 
     */
    @Import(name="sentiment", required=true)
      private final GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment;

    public GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment() {
        return this.sentiment;
    }

    /**
     * The type of the entity mention.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GoogleCloudContactcenterinsightsV1EntityMentionDataResponse(
        String entityUniqueId,
        GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment,
        String type) {
        this.entityUniqueId = Objects.requireNonNull(entityUniqueId, "expected parameter 'entityUniqueId' to be non-null");
        this.sentiment = Objects.requireNonNull(sentiment, "expected parameter 'sentiment' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1EntityMentionDataResponse() {
        this.entityUniqueId = null;
        this.sentiment = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1EntityMentionDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityUniqueId;
        private GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1EntityMentionDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityUniqueId = defaults.entityUniqueId;
    	      this.sentiment = defaults.sentiment;
    	      this.type = defaults.type;
        }

        public Builder entityUniqueId(String entityUniqueId) {
            this.entityUniqueId = Objects.requireNonNull(entityUniqueId);
            return this;
        }
        public Builder sentiment(GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment) {
            this.sentiment = Objects.requireNonNull(sentiment);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudContactcenterinsightsV1EntityMentionDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1EntityMentionDataResponse(entityUniqueId, sentiment, type);
        }
    }
}
