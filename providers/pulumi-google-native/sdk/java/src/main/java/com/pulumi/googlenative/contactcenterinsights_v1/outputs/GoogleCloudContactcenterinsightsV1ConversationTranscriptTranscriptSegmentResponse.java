// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1ConversationParticipantResponse;
import com.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse;
import com.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse;
import com.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1SentimentDataResponse;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse {
    /**
     * For conversations derived from multi-channel audio, this is the channel number corresponding to the audio from that channel. For audioChannelCount = N, its output values can range from '1' to 'N'. A channel tag of 0 indicates that the audio is mono.
     * 
     */
    private final Integer channelTag;
    /**
     * A confidence estimate between 0.0 and 1.0 of the fidelity of this segment. A default value of 0.0 indicates that the value is unset.
     * 
     */
    private final Double confidence;
    /**
     * CCAI metadata relating to the current transcript segment.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse dialogflowSegmentMetadata;
    /**
     * The language code of this segment as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
     */
    private final String languageCode;
    /**
     * The time that the message occurred, if provided.
     * 
     */
    private final String messageTime;
    /**
     * The participant of this segment.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1ConversationParticipantResponse segmentParticipant;
    /**
     * The sentiment for this transcript segment.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment;
    /**
     * The text of this segment.
     * 
     */
    private final String text;
    /**
     * A list of the word-specific information for each word in the segment.
     * 
     */
    private final List<GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse> words;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse(
        @CustomType.Parameter("channelTag") Integer channelTag,
        @CustomType.Parameter("confidence") Double confidence,
        @CustomType.Parameter("dialogflowSegmentMetadata") GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse dialogflowSegmentMetadata,
        @CustomType.Parameter("languageCode") String languageCode,
        @CustomType.Parameter("messageTime") String messageTime,
        @CustomType.Parameter("segmentParticipant") GoogleCloudContactcenterinsightsV1ConversationParticipantResponse segmentParticipant,
        @CustomType.Parameter("sentiment") GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment,
        @CustomType.Parameter("text") String text,
        @CustomType.Parameter("words") List<GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse> words) {
        this.channelTag = channelTag;
        this.confidence = confidence;
        this.dialogflowSegmentMetadata = dialogflowSegmentMetadata;
        this.languageCode = languageCode;
        this.messageTime = messageTime;
        this.segmentParticipant = segmentParticipant;
        this.sentiment = sentiment;
        this.text = text;
        this.words = words;
    }

    /**
     * For conversations derived from multi-channel audio, this is the channel number corresponding to the audio from that channel. For audioChannelCount = N, its output values can range from '1' to 'N'. A channel tag of 0 indicates that the audio is mono.
     * 
    */
    public Integer channelTag() {
        return this.channelTag;
    }
    /**
     * A confidence estimate between 0.0 and 1.0 of the fidelity of this segment. A default value of 0.0 indicates that the value is unset.
     * 
    */
    public Double confidence() {
        return this.confidence;
    }
    /**
     * CCAI metadata relating to the current transcript segment.
     * 
    */
    public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse dialogflowSegmentMetadata() {
        return this.dialogflowSegmentMetadata;
    }
    /**
     * The language code of this segment as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
    */
    public String languageCode() {
        return this.languageCode;
    }
    /**
     * The time that the message occurred, if provided.
     * 
    */
    public String messageTime() {
        return this.messageTime;
    }
    /**
     * The participant of this segment.
     * 
    */
    public GoogleCloudContactcenterinsightsV1ConversationParticipantResponse segmentParticipant() {
        return this.segmentParticipant;
    }
    /**
     * The sentiment for this transcript segment.
     * 
    */
    public GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment() {
        return this.sentiment;
    }
    /**
     * The text of this segment.
     * 
    */
    public String text() {
        return this.text;
    }
    /**
     * A list of the word-specific information for each word in the segment.
     * 
    */
    public List<GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse> words() {
        return this.words;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer channelTag;
        private Double confidence;
        private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse dialogflowSegmentMetadata;
        private String languageCode;
        private String messageTime;
        private GoogleCloudContactcenterinsightsV1ConversationParticipantResponse segmentParticipant;
        private GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment;
        private String text;
        private List<GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse> words;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelTag = defaults.channelTag;
    	      this.confidence = defaults.confidence;
    	      this.dialogflowSegmentMetadata = defaults.dialogflowSegmentMetadata;
    	      this.languageCode = defaults.languageCode;
    	      this.messageTime = defaults.messageTime;
    	      this.segmentParticipant = defaults.segmentParticipant;
    	      this.sentiment = defaults.sentiment;
    	      this.text = defaults.text;
    	      this.words = defaults.words;
        }

        public Builder channelTag(Integer channelTag) {
            this.channelTag = Objects.requireNonNull(channelTag);
            return this;
        }
        public Builder confidence(Double confidence) {
            this.confidence = Objects.requireNonNull(confidence);
            return this;
        }
        public Builder dialogflowSegmentMetadata(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse dialogflowSegmentMetadata) {
            this.dialogflowSegmentMetadata = Objects.requireNonNull(dialogflowSegmentMetadata);
            return this;
        }
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        public Builder messageTime(String messageTime) {
            this.messageTime = Objects.requireNonNull(messageTime);
            return this;
        }
        public Builder segmentParticipant(GoogleCloudContactcenterinsightsV1ConversationParticipantResponse segmentParticipant) {
            this.segmentParticipant = Objects.requireNonNull(segmentParticipant);
            return this;
        }
        public Builder sentiment(GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment) {
            this.sentiment = Objects.requireNonNull(sentiment);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder words(List<GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse> words) {
            this.words = Objects.requireNonNull(words);
            return this;
        }
        public Builder words(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse... words) {
            return words(List.of(words));
        }        public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse(channelTag, confidence, dialogflowSegmentMetadata, languageCode, messageTime, segmentParticipant, sentiment, text, words);
        }
    }
}
