// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * &lt;p&gt;Permission for the resource.&lt;/p&gt;
 * 
 */
public final class DataSourceResourcePermission extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceResourcePermission Empty = new DataSourceResourcePermission();

    /**
     * &lt;p&gt;The IAM action to grant or revoke permissions on.&lt;/p&gt;
     * 
     */
    @Import(name="actions", required=true)
      private final List<String> actions;

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
    @Import(name="principal", required=true)
      private final String principal;

    public String principal() {
        return this.principal;
    }

    public DataSourceResourcePermission(
        List<String> actions,
        String principal) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
    }

    private DataSourceResourcePermission() {
        this.actions = List.of();
        this.principal = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceResourcePermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceResourcePermission defaults) {
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
        }        public DataSourceResourcePermission build() {
            return new DataSourceResourcePermission(actions, principal);
        }
    }
}
