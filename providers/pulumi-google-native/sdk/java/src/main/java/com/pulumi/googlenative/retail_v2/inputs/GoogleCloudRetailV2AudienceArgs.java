// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An intended audience of the Product for whom it&#39;s sold.
 * 
 */
public final class GoogleCloudRetailV2AudienceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2AudienceArgs Empty = new GoogleCloudRetailV2AudienceArgs();

    /**
     * The age groups of the audience. Strongly encouraged to use the standard values: &#34;newborn&#34; (up to 3 months old), &#34;infant&#34; (3–12 months old), &#34;toddler&#34; (1–5 years old), &#34;kids&#34; (5–13 years old), &#34;adult&#34; (typically teens or older). At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [age_group](https://support.google.com/merchants/answer/6324463). Schema.org property [Product.audience.suggestedMinAge](https://schema.org/suggestedMinAge) and [Product.audience.suggestedMaxAge](https://schema.org/suggestedMaxAge).
     * 
     */
    @Import(name="ageGroups")
      private final @Nullable Output<List<String>> ageGroups;

    public Output<List<String>> ageGroups() {
        return this.ageGroups == null ? Codegen.empty() : this.ageGroups;
    }

    /**
     * The genders of the audience. Strongly encouraged to use the standard values: &#34;male&#34;, &#34;female&#34;, &#34;unisex&#34;. At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [gender](https://support.google.com/merchants/answer/6324479). Schema.org property [Product.audience.suggestedGender](https://schema.org/suggestedGender).
     * 
     */
    @Import(name="genders")
      private final @Nullable Output<List<String>> genders;

    public Output<List<String>> genders() {
        return this.genders == null ? Codegen.empty() : this.genders;
    }

    public GoogleCloudRetailV2AudienceArgs(
        @Nullable Output<List<String>> ageGroups,
        @Nullable Output<List<String>> genders) {
        this.ageGroups = ageGroups;
        this.genders = genders;
    }

    private GoogleCloudRetailV2AudienceArgs() {
        this.ageGroups = Codegen.empty();
        this.genders = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2AudienceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> ageGroups;
        private @Nullable Output<List<String>> genders;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2AudienceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ageGroups = defaults.ageGroups;
    	      this.genders = defaults.genders;
        }

        public Builder ageGroups(@Nullable Output<List<String>> ageGroups) {
            this.ageGroups = ageGroups;
            return this;
        }
        public Builder ageGroups(@Nullable List<String> ageGroups) {
            this.ageGroups = Codegen.ofNullable(ageGroups);
            return this;
        }
        public Builder ageGroups(String... ageGroups) {
            return ageGroups(List.of(ageGroups));
        }
        public Builder genders(@Nullable Output<List<String>> genders) {
            this.genders = genders;
            return this;
        }
        public Builder genders(@Nullable List<String> genders) {
            this.genders = Codegen.ofNullable(genders);
            return this;
        }
        public Builder genders(String... genders) {
            return genders(List.of(genders));
        }        public GoogleCloudRetailV2AudienceArgs build() {
            return new GoogleCloudRetailV2AudienceArgs(ageGroups, genders);
        }
    }
}
