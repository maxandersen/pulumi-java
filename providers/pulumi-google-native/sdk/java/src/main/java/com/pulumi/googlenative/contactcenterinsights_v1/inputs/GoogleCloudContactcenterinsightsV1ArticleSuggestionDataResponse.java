// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Agent Assist Article Suggestion data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse Empty = new GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse();

    /**
     * The system&#39;s confidence score that this article is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    @Import(name="confidenceScore", required=true)
    private Double confidenceScore;

    public Double confidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Map that contains metadata about the Article Suggestion and the document that it originates from.
     * 
     */
    @Import(name="metadata", required=true)
    private Map<String,String> metadata;

    public Map<String,String> metadata() {
        return this.metadata;
    }

    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
     */
    @Import(name="queryRecord", required=true)
    private String queryRecord;

    public String queryRecord() {
        return this.queryRecord;
    }

    /**
     * The knowledge document that this answer was extracted from. Format: projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}
     * 
     */
    @Import(name="source", required=true)
    private String source;

    public String source() {
        return this.source;
    }

    /**
     * Article title.
     * 
     */
    @Import(name="title", required=true)
    private String title;

    public String title() {
        return this.title;
    }

    /**
     * Article URI.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    public String uri() {
        return this.uri;
    }

    private GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse() {}

    private GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse(GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse $) {
        this.confidenceScore = $.confidenceScore;
        this.metadata = $.metadata;
        this.queryRecord = $.queryRecord;
        this.source = $.source;
        this.title = $.title;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse(Objects.requireNonNull(defaults));
        }

        public Builder confidenceScore(Double confidenceScore) {
            $.confidenceScore = confidenceScore;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder queryRecord(String queryRecord) {
            $.queryRecord = queryRecord;
            return this;
        }

        public Builder source(String source) {
            $.source = source;
            return this;
        }

        public Builder title(String title) {
            $.title = title;
            return this;
        }

        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse build() {
            $.confidenceScore = Objects.requireNonNull($.confidenceScore, "expected parameter 'confidenceScore' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            $.queryRecord = Objects.requireNonNull($.queryRecord, "expected parameter 'queryRecord' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
