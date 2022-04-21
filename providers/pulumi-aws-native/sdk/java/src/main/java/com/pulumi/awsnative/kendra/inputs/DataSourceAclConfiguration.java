// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataSourceAclConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceAclConfiguration Empty = new DataSourceAclConfiguration();

    @Import(name="allowedGroupsColumnName", required=true)
    private String allowedGroupsColumnName;

    public String allowedGroupsColumnName() {
        return this.allowedGroupsColumnName;
    }

    private DataSourceAclConfiguration() {}

    private DataSourceAclConfiguration(DataSourceAclConfiguration $) {
        this.allowedGroupsColumnName = $.allowedGroupsColumnName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceAclConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceAclConfiguration $;

        public Builder() {
            $ = new DataSourceAclConfiguration();
        }

        public Builder(DataSourceAclConfiguration defaults) {
            $ = new DataSourceAclConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder allowedGroupsColumnName(String allowedGroupsColumnName) {
            $.allowedGroupsColumnName = allowedGroupsColumnName;
            return this;
        }

        public DataSourceAclConfiguration build() {
            $.allowedGroupsColumnName = Objects.requireNonNull($.allowedGroupsColumnName, "expected parameter 'allowedGroupsColumnName' to be non-null");
            return $;
        }
    }

}
