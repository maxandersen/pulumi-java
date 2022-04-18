// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1EntityMetadataResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetApiResult {
    /**
     * User labels applied to this API Proxy.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The id of the most recently created revision for this api proxy.
     * 
     */
    private final String latestRevisionId;
    /**
     * Metadata describing the API proxy.
     * 
     */
    private final GoogleCloudApigeeV1EntityMetadataResponse metaData;
    /**
     * Name of the API proxy.
     * 
     */
    private final String name;
    /**
     * List of revisons defined for the API proxy.
     * 
     */
    private final List<String> revision;

    @CustomType.Constructor
    private GetApiResult(
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("latestRevisionId") String latestRevisionId,
        @CustomType.Parameter("metaData") GoogleCloudApigeeV1EntityMetadataResponse metaData,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("revision") List<String> revision) {
        this.labels = labels;
        this.latestRevisionId = latestRevisionId;
        this.metaData = metaData;
        this.name = name;
        this.revision = revision;
    }

    /**
     * User labels applied to this API Proxy.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The id of the most recently created revision for this api proxy.
     * 
    */
    public String latestRevisionId() {
        return this.latestRevisionId;
    }
    /**
     * Metadata describing the API proxy.
     * 
    */
    public GoogleCloudApigeeV1EntityMetadataResponse metaData() {
        return this.metaData;
    }
    /**
     * Name of the API proxy.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * List of revisons defined for the API proxy.
     * 
    */
    public List<String> revision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;
        private String latestRevisionId;
        private GoogleCloudApigeeV1EntityMetadataResponse metaData;
        private String name;
        private List<String> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.latestRevisionId = defaults.latestRevisionId;
    	      this.metaData = defaults.metaData;
    	      this.name = defaults.name;
    	      this.revision = defaults.revision;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder latestRevisionId(String latestRevisionId) {
            this.latestRevisionId = Objects.requireNonNull(latestRevisionId);
            return this;
        }
        public Builder metaData(GoogleCloudApigeeV1EntityMetadataResponse metaData) {
            this.metaData = Objects.requireNonNull(metaData);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder revision(List<String> revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder revision(String... revision) {
            return revision(List.of(revision));
        }        public GetApiResult build() {
            return new GetApiResult(labels, latestRevisionId, metaData, name, revision);
        }
    }
}
