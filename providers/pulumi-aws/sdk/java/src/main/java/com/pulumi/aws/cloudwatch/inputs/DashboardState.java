// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DashboardState extends com.pulumi.resources.ResourceArgs {

    public static final DashboardState Empty = new DashboardState();

    /**
     * The Amazon Resource Name (ARN) of the dashboard.
     * 
     */
    @Import(name="dashboardArn")
      private final @Nullable Output<String> dashboardArn;

    public Output<String> dashboardArn() {
        return this.dashboardArn == null ? Codegen.empty() : this.dashboardArn;
    }

    /**
     * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
     * 
     */
    @Import(name="dashboardBody")
      private final @Nullable Output<String> dashboardBody;

    public Output<String> dashboardBody() {
        return this.dashboardBody == null ? Codegen.empty() : this.dashboardBody;
    }

    /**
     * The name of the dashboard.
     * 
     */
    @Import(name="dashboardName")
      private final @Nullable Output<String> dashboardName;

    public Output<String> dashboardName() {
        return this.dashboardName == null ? Codegen.empty() : this.dashboardName;
    }

    public DashboardState(
        @Nullable Output<String> dashboardArn,
        @Nullable Output<String> dashboardBody,
        @Nullable Output<String> dashboardName) {
        this.dashboardArn = dashboardArn;
        this.dashboardBody = dashboardBody;
        this.dashboardName = dashboardName;
    }

    private DashboardState() {
        this.dashboardArn = Codegen.empty();
        this.dashboardBody = Codegen.empty();
        this.dashboardName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dashboardArn;
        private @Nullable Output<String> dashboardBody;
        private @Nullable Output<String> dashboardName;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dashboardArn = defaults.dashboardArn;
    	      this.dashboardBody = defaults.dashboardBody;
    	      this.dashboardName = defaults.dashboardName;
        }

        public Builder dashboardArn(@Nullable Output<String> dashboardArn) {
            this.dashboardArn = dashboardArn;
            return this;
        }
        public Builder dashboardArn(@Nullable String dashboardArn) {
            this.dashboardArn = Codegen.ofNullable(dashboardArn);
            return this;
        }
        public Builder dashboardBody(@Nullable Output<String> dashboardBody) {
            this.dashboardBody = dashboardBody;
            return this;
        }
        public Builder dashboardBody(@Nullable String dashboardBody) {
            this.dashboardBody = Codegen.ofNullable(dashboardBody);
            return this;
        }
        public Builder dashboardName(@Nullable Output<String> dashboardName) {
            this.dashboardName = dashboardName;
            return this;
        }
        public Builder dashboardName(@Nullable String dashboardName) {
            this.dashboardName = Codegen.ofNullable(dashboardName);
            return this;
        }        public DashboardState build() {
            return new DashboardState(dashboardArn, dashboardBody, dashboardName);
        }
    }
}
