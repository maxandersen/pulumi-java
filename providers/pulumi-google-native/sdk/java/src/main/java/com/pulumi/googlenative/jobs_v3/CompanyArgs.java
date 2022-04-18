// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.jobs_v3.enums.CompanySize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CompanyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CompanyArgs Empty = new CompanyArgs();

    /**
     * Optional. The URI to employer's career site or careers page on the employer's web site, for example, "https://careers.google.com".
     * 
     */
    @Import(name="careerSiteUri")
      private final @Nullable Output<String> careerSiteUri;

    public Output<String> careerSiteUri() {
        return this.careerSiteUri == null ? Codegen.empty() : this.careerSiteUri;
    }

    /**
     * The display name of the company, for example, "Google LLC".
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    @Import(name="eeoText")
      private final @Nullable Output<String> eeoText;

    public Output<String> eeoText() {
        return this.eeoText == null ? Codegen.empty() : this.eeoText;
    }

    /**
     * Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    @Import(name="externalId", required=true)
      private final Output<String> externalId;

    public Output<String> externalId() {
        return this.externalId;
    }

    /**
     * Optional. The street address of the company's main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    @Import(name="headquartersAddress")
      private final @Nullable Output<String> headquartersAddress;

    public Output<String> headquartersAddress() {
        return this.headquartersAddress == null ? Codegen.empty() : this.headquartersAddress;
    }

    /**
     * Optional. Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    @Import(name="hiringAgency")
      private final @Nullable Output<Boolean> hiringAgency;

    public Output<Boolean> hiringAgency() {
        return this.hiringAgency == null ? Codegen.empty() : this.hiringAgency;
    }

    /**
     * Optional. A URI that hosts the employer's company logo.
     * 
     */
    @Import(name="imageUri")
      private final @Nullable Output<String> imageUri;

    public Output<String> imageUri() {
        return this.imageUri == null ? Codegen.empty() : this.imageUri;
    }

    /**
     * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword search. Jobs with `string_values` under these specified field keys are returned if any of the values matches the search keyword. Custom field values with parenthesis, brackets and special symbols won't be properly searchable, and those keyword queries need to be surrounded by quotes.
     * 
     */
    @Import(name="keywordSearchableJobCustomAttributes")
      private final @Nullable Output<List<String>> keywordSearchableJobCustomAttributes;

    public Output<List<String>> keywordSearchableJobCustomAttributes() {
        return this.keywordSearchableJobCustomAttributes == null ? Codegen.empty() : this.keywordSearchableJobCustomAttributes;
    }

    /**
     * Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. The employer's company size.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<CompanySize> size;

    public Output<CompanySize> size() {
        return this.size == null ? Codegen.empty() : this.size;
    }

    /**
     * Optional. The URI representing the company's primary web site or home page, for example, "https://www.google.com". The maximum number of allowed characters is 255.
     * 
     */
    @Import(name="websiteUri")
      private final @Nullable Output<String> websiteUri;

    public Output<String> websiteUri() {
        return this.websiteUri == null ? Codegen.empty() : this.websiteUri;
    }

    public CompanyArgs(
        @Nullable Output<String> careerSiteUri,
        Output<String> displayName,
        @Nullable Output<String> eeoText,
        Output<String> externalId,
        @Nullable Output<String> headquartersAddress,
        @Nullable Output<Boolean> hiringAgency,
        @Nullable Output<String> imageUri,
        @Nullable Output<List<String>> keywordSearchableJobCustomAttributes,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<CompanySize> size,
        @Nullable Output<String> websiteUri) {
        this.careerSiteUri = careerSiteUri;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.eeoText = eeoText;
        this.externalId = Objects.requireNonNull(externalId, "expected parameter 'externalId' to be non-null");
        this.headquartersAddress = headquartersAddress;
        this.hiringAgency = hiringAgency;
        this.imageUri = imageUri;
        this.keywordSearchableJobCustomAttributes = keywordSearchableJobCustomAttributes;
        this.name = name;
        this.project = project;
        this.size = size;
        this.websiteUri = websiteUri;
    }

    private CompanyArgs() {
        this.careerSiteUri = Codegen.empty();
        this.displayName = Codegen.empty();
        this.eeoText = Codegen.empty();
        this.externalId = Codegen.empty();
        this.headquartersAddress = Codegen.empty();
        this.hiringAgency = Codegen.empty();
        this.imageUri = Codegen.empty();
        this.keywordSearchableJobCustomAttributes = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.size = Codegen.empty();
        this.websiteUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompanyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> careerSiteUri;
        private Output<String> displayName;
        private @Nullable Output<String> eeoText;
        private Output<String> externalId;
        private @Nullable Output<String> headquartersAddress;
        private @Nullable Output<Boolean> hiringAgency;
        private @Nullable Output<String> imageUri;
        private @Nullable Output<List<String>> keywordSearchableJobCustomAttributes;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<CompanySize> size;
        private @Nullable Output<String> websiteUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CompanyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.careerSiteUri = defaults.careerSiteUri;
    	      this.displayName = defaults.displayName;
    	      this.eeoText = defaults.eeoText;
    	      this.externalId = defaults.externalId;
    	      this.headquartersAddress = defaults.headquartersAddress;
    	      this.hiringAgency = defaults.hiringAgency;
    	      this.imageUri = defaults.imageUri;
    	      this.keywordSearchableJobCustomAttributes = defaults.keywordSearchableJobCustomAttributes;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.size = defaults.size;
    	      this.websiteUri = defaults.websiteUri;
        }

        public Builder careerSiteUri(@Nullable Output<String> careerSiteUri) {
            this.careerSiteUri = careerSiteUri;
            return this;
        }
        public Builder careerSiteUri(@Nullable String careerSiteUri) {
            this.careerSiteUri = Codegen.ofNullable(careerSiteUri);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder eeoText(@Nullable Output<String> eeoText) {
            this.eeoText = eeoText;
            return this;
        }
        public Builder eeoText(@Nullable String eeoText) {
            this.eeoText = Codegen.ofNullable(eeoText);
            return this;
        }
        public Builder externalId(Output<String> externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }
        public Builder externalId(String externalId) {
            this.externalId = Output.of(Objects.requireNonNull(externalId));
            return this;
        }
        public Builder headquartersAddress(@Nullable Output<String> headquartersAddress) {
            this.headquartersAddress = headquartersAddress;
            return this;
        }
        public Builder headquartersAddress(@Nullable String headquartersAddress) {
            this.headquartersAddress = Codegen.ofNullable(headquartersAddress);
            return this;
        }
        public Builder hiringAgency(@Nullable Output<Boolean> hiringAgency) {
            this.hiringAgency = hiringAgency;
            return this;
        }
        public Builder hiringAgency(@Nullable Boolean hiringAgency) {
            this.hiringAgency = Codegen.ofNullable(hiringAgency);
            return this;
        }
        public Builder imageUri(@Nullable Output<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public Builder imageUri(@Nullable String imageUri) {
            this.imageUri = Codegen.ofNullable(imageUri);
            return this;
        }
        public Builder keywordSearchableJobCustomAttributes(@Nullable Output<List<String>> keywordSearchableJobCustomAttributes) {
            this.keywordSearchableJobCustomAttributes = keywordSearchableJobCustomAttributes;
            return this;
        }
        public Builder keywordSearchableJobCustomAttributes(@Nullable List<String> keywordSearchableJobCustomAttributes) {
            this.keywordSearchableJobCustomAttributes = Codegen.ofNullable(keywordSearchableJobCustomAttributes);
            return this;
        }
        public Builder keywordSearchableJobCustomAttributes(String... keywordSearchableJobCustomAttributes) {
            return keywordSearchableJobCustomAttributes(List.of(keywordSearchableJobCustomAttributes));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder size(@Nullable Output<CompanySize> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable CompanySize size) {
            this.size = Codegen.ofNullable(size);
            return this;
        }
        public Builder websiteUri(@Nullable Output<String> websiteUri) {
            this.websiteUri = websiteUri;
            return this;
        }
        public Builder websiteUri(@Nullable String websiteUri) {
            this.websiteUri = Codegen.ofNullable(websiteUri);
            return this;
        }        public CompanyArgs build() {
            return new CompanyArgs(careerSiteUri, displayName, eeoText, externalId, headquartersAddress, hiringAgency, imageUri, keywordSearchableJobCustomAttributes, name, project, size, websiteUri);
        }
    }
}
