// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Instructions regarding the table content being inspected.
 * 
 */
public final class GooglePrivacyDlpV2TableOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2TableOptionsArgs Empty = new GooglePrivacyDlpV2TableOptionsArgs();

    /**
     * The columns that are the primary keys for table objects included in ContentItem. A copy of this cell's value will stored alongside alongside each finding so that the finding can be traced to the specific row it came from. No more than 3 may be provided.
     * 
     */
    @Import(name="identifyingFields")
      private final @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields;

    public Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields() {
        return this.identifyingFields == null ? Codegen.empty() : this.identifyingFields;
    }

    public GooglePrivacyDlpV2TableOptionsArgs(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields) {
        this.identifyingFields = identifyingFields;
    }

    private GooglePrivacyDlpV2TableOptionsArgs() {
        this.identifyingFields = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TableOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TableOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifyingFields = defaults.identifyingFields;
        }

        public Builder identifyingFields(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields) {
            this.identifyingFields = identifyingFields;
            return this;
        }
        public Builder identifyingFields(@Nullable List<GooglePrivacyDlpV2FieldIdArgs> identifyingFields) {
            this.identifyingFields = Codegen.ofNullable(identifyingFields);
            return this;
        }
        public Builder identifyingFields(GooglePrivacyDlpV2FieldIdArgs... identifyingFields) {
            return identifyingFields(List.of(identifyingFields));
        }        public GooglePrivacyDlpV2TableOptionsArgs build() {
            return new GooglePrivacyDlpV2TableOptionsArgs(identifyingFields);
        }
    }
}
