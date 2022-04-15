// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReportArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReportArgs Empty = new GetReportArgs();

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="reportId", required=true)
      private final String reportId;

    public String reportId() {
        return this.reportId;
    }

    public GetReportArgs(
        String organizationId,
        String reportId) {
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.reportId = Objects.requireNonNull(reportId, "expected parameter 'reportId' to be non-null");
    }

    private GetReportArgs() {
        this.organizationId = null;
        this.reportId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String organizationId;
        private String reportId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationId = defaults.organizationId;
    	      this.reportId = defaults.reportId;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder reportId(String reportId) {
            this.reportId = Objects.requireNonNull(reportId);
            return this;
        }        public GetReportArgs build() {
            return new GetReportArgs(organizationId, reportId);
        }
    }
}
