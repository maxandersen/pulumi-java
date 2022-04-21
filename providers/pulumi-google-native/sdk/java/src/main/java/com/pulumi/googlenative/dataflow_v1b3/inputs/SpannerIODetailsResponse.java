// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata for a Spanner connector used by the job.
 * 
 */
public final class SpannerIODetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SpannerIODetailsResponse Empty = new SpannerIODetailsResponse();

    /**
     * DatabaseId accessed in the connection.
     * 
     */
    @Import(name="databaseId", required=true)
    private String databaseId;

    public String databaseId() {
        return this.databaseId;
    }

    /**
     * InstanceId accessed in the connection.
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    /**
     * ProjectId accessed in the connection.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    public String project() {
        return this.project;
    }

    private SpannerIODetailsResponse() {}

    private SpannerIODetailsResponse(SpannerIODetailsResponse $) {
        this.databaseId = $.databaseId;
        this.instanceId = $.instanceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpannerIODetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpannerIODetailsResponse $;

        public Builder() {
            $ = new SpannerIODetailsResponse();
        }

        public Builder(SpannerIODetailsResponse defaults) {
            $ = new SpannerIODetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder databaseId(String databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public SpannerIODetailsResponse build() {
            $.databaseId = Objects.requireNonNull($.databaseId, "expected parameter 'databaseId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
