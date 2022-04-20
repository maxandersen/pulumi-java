// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetSecurityGroupsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityGroupsResult {
    /**
     * ARNs of the matched security groups.
     * 
     */
    private final List<String> arns;
    private final @Nullable List<GetSecurityGroupsFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * IDs of the matches security groups.
     * 
     */
    private final List<String> ids;
    private final Map<String,String> tags;
    /**
     * The VPC IDs of the matched security groups. The data source&#39;s tag or filter *will span VPCs* unless the `vpc-id` filter is also used.
     * 
     */
    private final List<String> vpcIds;

    @CustomType.Constructor
    private GetSecurityGroupsResult(
        @CustomType.Parameter("arns") List<String> arns,
        @CustomType.Parameter("filters") @Nullable List<GetSecurityGroupsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vpcIds") List<String> vpcIds) {
        this.arns = arns;
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.tags = tags;
        this.vpcIds = vpcIds;
    }

    /**
     * ARNs of the matched security groups.
     * 
    */
    public List<String> arns() {
        return this.arns;
    }
    public List<GetSecurityGroupsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * IDs of the matches security groups.
     * 
    */
    public List<String> ids() {
        return this.ids;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * The VPC IDs of the matched security groups. The data source&#39;s tag or filter *will span VPCs* unless the `vpc-id` filter is also used.
     * 
    */
    public List<String> vpcIds() {
        return this.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private @Nullable List<GetSecurityGroupsFilter> filters;
        private String id;
        private List<String> ids;
        private Map<String,String> tags;
        private List<String> vpcIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
    	      this.vpcIds = defaults.vpcIds;
        }

        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        public Builder filters(@Nullable List<GetSecurityGroupsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSecurityGroupsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpcIds(List<String> vpcIds) {
            this.vpcIds = Objects.requireNonNull(vpcIds);
            return this;
        }
        public Builder vpcIds(String... vpcIds) {
            return vpcIds(List.of(vpcIds));
        }        public GetSecurityGroupsResult build() {
            return new GetSecurityGroupsResult(arns, filters, id, ids, tags, vpcIds);
        }
    }
}
