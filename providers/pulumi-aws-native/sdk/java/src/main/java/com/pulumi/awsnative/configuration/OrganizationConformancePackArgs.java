// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.configuration;

import com.pulumi.awsnative.configuration.inputs.OrganizationConformancePackConformancePackInputParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationConformancePackArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationConformancePackArgs Empty = new OrganizationConformancePackArgs();

    /**
     * A list of ConformancePackInputParameter objects.
     * 
     */
    @Import(name="conformancePackInputParameters")
      private final @Nullable Output<List<OrganizationConformancePackConformancePackInputParameterArgs>> conformancePackInputParameters;

    public Output<List<OrganizationConformancePackConformancePackInputParameterArgs>> conformancePackInputParameters() {
        return this.conformancePackInputParameters == null ? Codegen.empty() : this.conformancePackInputParameters;
    }

    /**
     * AWS Config stores intermediate files while processing conformance pack template.
     * 
     */
    @Import(name="deliveryS3Bucket")
      private final @Nullable Output<String> deliveryS3Bucket;

    public Output<String> deliveryS3Bucket() {
        return this.deliveryS3Bucket == null ? Codegen.empty() : this.deliveryS3Bucket;
    }

    /**
     * The prefix for the delivery S3 bucket.
     * 
     */
    @Import(name="deliveryS3KeyPrefix")
      private final @Nullable Output<String> deliveryS3KeyPrefix;

    public Output<String> deliveryS3KeyPrefix() {
        return this.deliveryS3KeyPrefix == null ? Codegen.empty() : this.deliveryS3KeyPrefix;
    }

    /**
     * A list of AWS accounts to be excluded from an organization conformance pack while deploying a conformance pack.
     * 
     */
    @Import(name="excludedAccounts")
      private final @Nullable Output<List<String>> excludedAccounts;

    public Output<List<String>> excludedAccounts() {
        return this.excludedAccounts == null ? Codegen.empty() : this.excludedAccounts;
    }

    /**
     * The name of the organization conformance pack.
     * 
     */
    @Import(name="organizationConformancePackName")
      private final @Nullable Output<String> organizationConformancePackName;

    public Output<String> organizationConformancePackName() {
        return this.organizationConformancePackName == null ? Codegen.empty() : this.organizationConformancePackName;
    }

    /**
     * A string containing full conformance pack template body.
     * 
     */
    @Import(name="templateBody")
      private final @Nullable Output<String> templateBody;

    public Output<String> templateBody() {
        return this.templateBody == null ? Codegen.empty() : this.templateBody;
    }

    /**
     * Location of file containing the template body.
     * 
     */
    @Import(name="templateS3Uri")
      private final @Nullable Output<String> templateS3Uri;

    public Output<String> templateS3Uri() {
        return this.templateS3Uri == null ? Codegen.empty() : this.templateS3Uri;
    }

    public OrganizationConformancePackArgs(
        @Nullable Output<List<OrganizationConformancePackConformancePackInputParameterArgs>> conformancePackInputParameters,
        @Nullable Output<String> deliveryS3Bucket,
        @Nullable Output<String> deliveryS3KeyPrefix,
        @Nullable Output<List<String>> excludedAccounts,
        @Nullable Output<String> organizationConformancePackName,
        @Nullable Output<String> templateBody,
        @Nullable Output<String> templateS3Uri) {
        this.conformancePackInputParameters = conformancePackInputParameters;
        this.deliveryS3Bucket = deliveryS3Bucket;
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
        this.excludedAccounts = excludedAccounts;
        this.organizationConformancePackName = organizationConformancePackName;
        this.templateBody = templateBody;
        this.templateS3Uri = templateS3Uri;
    }

    private OrganizationConformancePackArgs() {
        this.conformancePackInputParameters = Codegen.empty();
        this.deliveryS3Bucket = Codegen.empty();
        this.deliveryS3KeyPrefix = Codegen.empty();
        this.excludedAccounts = Codegen.empty();
        this.organizationConformancePackName = Codegen.empty();
        this.templateBody = Codegen.empty();
        this.templateS3Uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConformancePackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OrganizationConformancePackConformancePackInputParameterArgs>> conformancePackInputParameters;
        private @Nullable Output<String> deliveryS3Bucket;
        private @Nullable Output<String> deliveryS3KeyPrefix;
        private @Nullable Output<List<String>> excludedAccounts;
        private @Nullable Output<String> organizationConformancePackName;
        private @Nullable Output<String> templateBody;
        private @Nullable Output<String> templateS3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConformancePackArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conformancePackInputParameters = defaults.conformancePackInputParameters;
    	      this.deliveryS3Bucket = defaults.deliveryS3Bucket;
    	      this.deliveryS3KeyPrefix = defaults.deliveryS3KeyPrefix;
    	      this.excludedAccounts = defaults.excludedAccounts;
    	      this.organizationConformancePackName = defaults.organizationConformancePackName;
    	      this.templateBody = defaults.templateBody;
    	      this.templateS3Uri = defaults.templateS3Uri;
        }

        public Builder conformancePackInputParameters(@Nullable Output<List<OrganizationConformancePackConformancePackInputParameterArgs>> conformancePackInputParameters) {
            this.conformancePackInputParameters = conformancePackInputParameters;
            return this;
        }
        public Builder conformancePackInputParameters(@Nullable List<OrganizationConformancePackConformancePackInputParameterArgs> conformancePackInputParameters) {
            this.conformancePackInputParameters = Codegen.ofNullable(conformancePackInputParameters);
            return this;
        }
        public Builder conformancePackInputParameters(OrganizationConformancePackConformancePackInputParameterArgs... conformancePackInputParameters) {
            return conformancePackInputParameters(List.of(conformancePackInputParameters));
        }
        public Builder deliveryS3Bucket(@Nullable Output<String> deliveryS3Bucket) {
            this.deliveryS3Bucket = deliveryS3Bucket;
            return this;
        }
        public Builder deliveryS3Bucket(@Nullable String deliveryS3Bucket) {
            this.deliveryS3Bucket = Codegen.ofNullable(deliveryS3Bucket);
            return this;
        }
        public Builder deliveryS3KeyPrefix(@Nullable Output<String> deliveryS3KeyPrefix) {
            this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
            return this;
        }
        public Builder deliveryS3KeyPrefix(@Nullable String deliveryS3KeyPrefix) {
            this.deliveryS3KeyPrefix = Codegen.ofNullable(deliveryS3KeyPrefix);
            return this;
        }
        public Builder excludedAccounts(@Nullable Output<List<String>> excludedAccounts) {
            this.excludedAccounts = excludedAccounts;
            return this;
        }
        public Builder excludedAccounts(@Nullable List<String> excludedAccounts) {
            this.excludedAccounts = Codegen.ofNullable(excludedAccounts);
            return this;
        }
        public Builder excludedAccounts(String... excludedAccounts) {
            return excludedAccounts(List.of(excludedAccounts));
        }
        public Builder organizationConformancePackName(@Nullable Output<String> organizationConformancePackName) {
            this.organizationConformancePackName = organizationConformancePackName;
            return this;
        }
        public Builder organizationConformancePackName(@Nullable String organizationConformancePackName) {
            this.organizationConformancePackName = Codegen.ofNullable(organizationConformancePackName);
            return this;
        }
        public Builder templateBody(@Nullable Output<String> templateBody) {
            this.templateBody = templateBody;
            return this;
        }
        public Builder templateBody(@Nullable String templateBody) {
            this.templateBody = Codegen.ofNullable(templateBody);
            return this;
        }
        public Builder templateS3Uri(@Nullable Output<String> templateS3Uri) {
            this.templateS3Uri = templateS3Uri;
            return this;
        }
        public Builder templateS3Uri(@Nullable String templateS3Uri) {
            this.templateS3Uri = Codegen.ofNullable(templateS3Uri);
            return this;
        }        public OrganizationConformancePackArgs build() {
            return new OrganizationConformancePackArgs(conformancePackInputParameters, deliveryS3Bucket, deliveryS3KeyPrefix, excludedAccounts, organizationConformancePackName, templateBody, templateS3Uri);
        }
    }
}
