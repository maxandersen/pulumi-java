// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ValueResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse {
    /**
     * Size of the equivalence class, for example number of rows with the above set of values.
     * 
     */
    private final String equivalenceClassSize;
    /**
     * Set of values defining the equivalence class. One value per quasi-identifier column in the original KAnonymity metric message. The order is always the same as the original request.
     * 
     */
    private final List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse(
        @OutputCustomType.Parameter("equivalenceClassSize") String equivalenceClassSize,
        @OutputCustomType.Parameter("quasiIdsValues") List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues) {
        this.equivalenceClassSize = equivalenceClassSize;
        this.quasiIdsValues = quasiIdsValues;
    }

    /**
     * Size of the equivalence class, for example number of rows with the above set of values.
     * 
    */
    public String getEquivalenceClassSize() {
        return this.equivalenceClassSize;
    }
    /**
     * Set of values defining the equivalence class. One value per quasi-identifier column in the original KAnonymity metric message. The order is always the same as the original request.
     * 
    */
    public List<GooglePrivacyDlpV2ValueResponse> getQuasiIdsValues() {
        return this.quasiIdsValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String equivalenceClassSize;
        private List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equivalenceClassSize = defaults.equivalenceClassSize;
    	      this.quasiIdsValues = defaults.quasiIdsValues;
        }

        public Builder setEquivalenceClassSize(String equivalenceClassSize) {
            this.equivalenceClassSize = Objects.requireNonNull(equivalenceClassSize);
            return this;
        }

        public Builder setQuasiIdsValues(List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues) {
            this.quasiIdsValues = Objects.requireNonNull(quasiIdsValues);
            return this;
        }
        public GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse build() {
            return new GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse(equivalenceClassSize, quasiIdsValues);
        }
    }
}
