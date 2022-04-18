// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class DataplexConfigResponse {
    /**
     * A reference to the Lake resources that this metastore service is attached to. The key is the lake resource name. Example: projects/{project_number}/locations/{location_id}/lakes/{lake_id}.
     * 
     */
    private final Map<String,String> lakeResources;

    @CustomType.Constructor
    private DataplexConfigResponse(@CustomType.Parameter("lakeResources") Map<String,String> lakeResources) {
        this.lakeResources = lakeResources;
    }

    /**
     * A reference to the Lake resources that this metastore service is attached to. The key is the lake resource name. Example: projects/{project_number}/locations/{location_id}/lakes/{lake_id}.
     * 
    */
    public Map<String,String> lakeResources() {
        return this.lakeResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataplexConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> lakeResources;

        public Builder() {
    	      // Empty
        }

        public Builder(DataplexConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lakeResources = defaults.lakeResources;
        }

        public Builder lakeResources(Map<String,String> lakeResources) {
            this.lakeResources = Objects.requireNonNull(lakeResources);
            return this;
        }        public DataplexConfigResponse build() {
            return new DataplexConfigResponse(lakeResources);
        }
    }
}
