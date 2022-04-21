// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Node Group Affinity for clusters using sole-tenant node groups.
 * 
 */
public final class NodeGroupAffinityResponse extends com.pulumi.resources.InvokeArgs {

    public static final NodeGroupAffinityResponse Empty = new NodeGroupAffinityResponse();

    /**
     * The URI of a sole-tenant node group resource (https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups) that the cluster will be created on.A full URL, partial URI, or node group name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1 projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1 node-group-1
     * 
     */
    @Import(name="nodeGroupUri", required=true)
    private String nodeGroupUri;

    public String nodeGroupUri() {
        return this.nodeGroupUri;
    }

    private NodeGroupAffinityResponse() {}

    private NodeGroupAffinityResponse(NodeGroupAffinityResponse $) {
        this.nodeGroupUri = $.nodeGroupUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeGroupAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeGroupAffinityResponse $;

        public Builder() {
            $ = new NodeGroupAffinityResponse();
        }

        public Builder(NodeGroupAffinityResponse defaults) {
            $ = new NodeGroupAffinityResponse(Objects.requireNonNull(defaults));
        }

        public Builder nodeGroupUri(String nodeGroupUri) {
            $.nodeGroupUri = nodeGroupUri;
            return this;
        }

        public NodeGroupAffinityResponse build() {
            $.nodeGroupUri = Objects.requireNonNull($.nodeGroupUri, "expected parameter 'nodeGroupUri' to be non-null");
            return $;
        }
    }

}
