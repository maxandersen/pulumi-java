// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DataSetResourcePermission {
    /**
     * &lt;p&gt;The IAM action to grant or revoke permissions on.&lt;/p&gt;
     * 
     */
    private final List<String> actions;
    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the principal. This can be one of the
     *             following:&lt;/p&gt;
     *         &lt;ul&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)&lt;/p&gt;
     *             &lt;/li&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or theme. (This is common.)&lt;/p&gt;
     *             &lt;/li&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight
     *                     ARN. Use this option only to share resources (templates) across AWS accounts.
     *                     (This is less common.) &lt;/p&gt;
     *             &lt;/li&gt;
     *          &lt;/ul&gt;
     * 
     */
    private final String principal;

    @CustomType.Constructor
    private DataSetResourcePermission(
        @CustomType.Parameter("actions") List<String> actions,
        @CustomType.Parameter("principal") String principal) {
        this.actions = actions;
        this.principal = principal;
    }

    /**
     * &lt;p&gt;The IAM action to grant or revoke permissions on.&lt;/p&gt;
     * 
    */
    public List<String> actions() {
        return this.actions;
    }
    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the principal. This can be one of the
     *             following:&lt;/p&gt;
     *         &lt;ul&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)&lt;/p&gt;
     *             &lt;/li&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or theme. (This is common.)&lt;/p&gt;
     *             &lt;/li&gt;
     *             &lt;li&gt;
     *                 &lt;p&gt;The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight
     *                     ARN. Use this option only to share resources (templates) across AWS accounts.
     *                     (This is less common.) &lt;/p&gt;
     *             &lt;/li&gt;
     *          &lt;/ul&gt;
     * 
    */
    public String principal() {
        return this.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetResourcePermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetResourcePermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.principal = defaults.principal;
        }

        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }        public DataSetResourcePermission build() {
            return new DataSetResourcePermission(actions, principal);
        }
    }
}
