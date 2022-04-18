// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse {
    /**
     * A confidence estimate between 0.0 and 1.0 of the fidelity of this word. A default value of 0.0 indicates that the value is unset.
     * 
     */
    private final Double confidence;
    /**
     * Time offset of the end of this word relative to the beginning of the total conversation.
     * 
     */
    private final String endOffset;
    /**
     * Time offset of the start of this word relative to the beginning of the total conversation.
     * 
     */
    private final String startOffset;
    /**
     * The word itself. Includes punctuation marks that surround the word.
     * 
     */
    private final String word;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse(
        @CustomType.Parameter("confidence") Double confidence,
        @CustomType.Parameter("endOffset") String endOffset,
        @CustomType.Parameter("startOffset") String startOffset,
        @CustomType.Parameter("word") String word) {
        this.confidence = confidence;
        this.endOffset = endOffset;
        this.startOffset = startOffset;
        this.word = word;
    }

    /**
     * A confidence estimate between 0.0 and 1.0 of the fidelity of this word. A default value of 0.0 indicates that the value is unset.
     * 
    */
    public Double confidence() {
        return this.confidence;
    }
    /**
     * Time offset of the end of this word relative to the beginning of the total conversation.
     * 
    */
    public String endOffset() {
        return this.endOffset;
    }
    /**
     * Time offset of the start of this word relative to the beginning of the total conversation.
     * 
    */
    public String startOffset() {
        return this.startOffset;
    }
    /**
     * The word itself. Includes punctuation marks that surround the word.
     * 
    */
    public String word() {
        return this.word;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidence;
        private String endOffset;
        private String startOffset;
        private String word;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidence = defaults.confidence;
    	      this.endOffset = defaults.endOffset;
    	      this.startOffset = defaults.startOffset;
    	      this.word = defaults.word;
        }

        public Builder confidence(Double confidence) {
            this.confidence = Objects.requireNonNull(confidence);
            return this;
        }
        public Builder endOffset(String endOffset) {
            this.endOffset = Objects.requireNonNull(endOffset);
            return this;
        }
        public Builder startOffset(String startOffset) {
            this.startOffset = Objects.requireNonNull(startOffset);
            return this;
        }
        public Builder word(String word) {
            this.word = Objects.requireNonNull(word);
            return this;
        }        public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse(confidence, endOffset, startOffset, word);
        }
    }
}
