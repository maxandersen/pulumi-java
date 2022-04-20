// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.jobs_v3.JobArgs;
import com.pulumi.googlenative.jobs_v3.outputs.ApplicationInfoResponse;
import com.pulumi.googlenative.jobs_v3.outputs.CompensationInfoResponse;
import com.pulumi.googlenative.jobs_v3.outputs.JobDerivedInfoResponse;
import com.pulumi.googlenative.jobs_v3.outputs.ProcessingOptionsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new job. Typically, the job becomes searchable within 10 seconds, but it may take up to 5 minutes.
 * 
 */
@ResourceType(type="google-native:jobs/v3:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * Optional but strongly recommended for the best service experience. Location(s) where the employer is looking to hire for this job posting. Specifying the full street address(es) of the hiring location enables better API results, especially job searches by commute time. At most 50 locations are allowed for best search performance. If a job has more locations, it is suggested to split it into multiple jobs with unique requisition_ids (e.g. &#39;ReqA&#39; becomes &#39;ReqA-1&#39;, &#39;ReqA-2&#39;, etc.) as multiple jobs with the same company_name, language_code and requisition_id are not allowed. If the original requisition_id must be preserved, a custom field should be used for storage. It is also suggested to group the locations that close to each other in the same job for better search experience. Jobs with multiple addresses must have their addresses with the same LocationType to allow location filtering to work properly. (For example, a Job with addresses &#34;1600 Amphitheatre Parkway, Mountain View, CA, USA&#34; and &#34;London, UK&#34; may not have location filters applied correctly at search time since the first is a LocationType.STREET_ADDRESS and the second is a LocationType.LOCALITY.) If a job needs to have multiple addresses, it is suggested to split it into multiple jobs with same LocationTypes. The maximum number of allowed characters is 500.
     * 
     */
    @Export(name="addresses", type=List.class, parameters={String.class})
    private Output<List<String>> addresses;

    /**
     * @return Optional but strongly recommended for the best service experience. Location(s) where the employer is looking to hire for this job posting. Specifying the full street address(es) of the hiring location enables better API results, especially job searches by commute time. At most 50 locations are allowed for best search performance. If a job has more locations, it is suggested to split it into multiple jobs with unique requisition_ids (e.g. &#39;ReqA&#39; becomes &#39;ReqA-1&#39;, &#39;ReqA-2&#39;, etc.) as multiple jobs with the same company_name, language_code and requisition_id are not allowed. If the original requisition_id must be preserved, a custom field should be used for storage. It is also suggested to group the locations that close to each other in the same job for better search experience. Jobs with multiple addresses must have their addresses with the same LocationType to allow location filtering to work properly. (For example, a Job with addresses &#34;1600 Amphitheatre Parkway, Mountain View, CA, USA&#34; and &#34;London, UK&#34; may not have location filters applied correctly at search time since the first is a LocationType.STREET_ADDRESS and the second is a LocationType.LOCALITY.) If a job needs to have multiple addresses, it is suggested to split it into multiple jobs with same LocationTypes. The maximum number of allowed characters is 500.
     * 
     */
    public Output<List<String>> addresses() {
        return this.addresses;
    }
    /**
     * At least one field within ApplicationInfo must be specified. Job application information.
     * 
     */
    @Export(name="applicationInfo", type=ApplicationInfoResponse.class, parameters={})
    private Output<ApplicationInfoResponse> applicationInfo;

    /**
     * @return At least one field within ApplicationInfo must be specified. Job application information.
     * 
     */
    public Output<ApplicationInfoResponse> applicationInfo() {
        return this.applicationInfo;
    }
    /**
     * Display name of the company listing the job.
     * 
     */
    @Export(name="companyDisplayName", type=String.class, parameters={})
    private Output<String> companyDisplayName;

    /**
     * @return Display name of the company listing the job.
     * 
     */
    public Output<String> companyDisplayName() {
        return this.companyDisplayName;
    }
    /**
     * The resource name of the company listing the job, such as &#34;projects/api-test-project/companies/foo&#34;.
     * 
     */
    @Export(name="companyName", type=String.class, parameters={})
    private Output<String> companyName;

    /**
     * @return The resource name of the company listing the job, such as &#34;projects/api-test-project/companies/foo&#34;.
     * 
     */
    public Output<String> companyName() {
        return this.companyName;
    }
    /**
     * Optional. Job compensation information.
     * 
     */
    @Export(name="compensationInfo", type=CompensationInfoResponse.class, parameters={})
    private Output<CompensationInfoResponse> compensationInfo;

    /**
     * @return Optional. Job compensation information.
     * 
     */
    public Output<CompensationInfoResponse> compensationInfo() {
        return this.compensationInfo;
    }
    /**
     * Optional. A map of fields to hold both filterable and non-filterable custom job attributes that are not covered by the provided structured fields. The keys of the map are strings up to 64 bytes and must match the pattern: a-zA-Z*. For example, key0LikeThis or KEY_1_LIKE_THIS. At most 100 filterable and at most 100 unfilterable keys are supported. For filterable `string_values`, across all keys at most 200 values are allowed, with each string no more than 255 characters. For unfilterable `string_values`, the maximum total size of `string_values` across all keys is 50KB.
     * 
     */
    @Export(name="customAttributes", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> customAttributes;

    /**
     * @return Optional. A map of fields to hold both filterable and non-filterable custom job attributes that are not covered by the provided structured fields. The keys of the map are strings up to 64 bytes and must match the pattern: a-zA-Z*. For example, key0LikeThis or KEY_1_LIKE_THIS. At most 100 filterable and at most 100 unfilterable keys are supported. For filterable `string_values`, across all keys at most 200 values are allowed, with each string no more than 255 characters. For unfilterable `string_values`, the maximum total size of `string_values` across all keys is 50KB.
     * 
     */
    public Output<Map<String,String>> customAttributes() {
        return this.customAttributes;
    }
    /**
     * Optional. The desired education degrees for the job, such as Bachelors, Masters.
     * 
     */
    @Export(name="degreeTypes", type=List.class, parameters={String.class})
    private Output<List<String>> degreeTypes;

    /**
     * @return Optional. The desired education degrees for the job, such as Bachelors, Masters.
     * 
     */
    public Output<List<String>> degreeTypes() {
        return this.degreeTypes;
    }
    /**
     * Optional. The department or functional area within the company with the open position. The maximum number of allowed characters is 255.
     * 
     */
    @Export(name="department", type=String.class, parameters={})
    private Output<String> department;

    /**
     * @return Optional. The department or functional area within the company with the open position. The maximum number of allowed characters is 255.
     * 
     */
    public Output<String> department() {
        return this.department;
    }
    /**
     * Derived details about the job posting.
     * 
     */
    @Export(name="derivedInfo", type=JobDerivedInfoResponse.class, parameters={})
    private Output<JobDerivedInfoResponse> derivedInfo;

    /**
     * @return Derived details about the job posting.
     * 
     */
    public Output<JobDerivedInfoResponse> derivedInfo() {
        return this.derivedInfo;
    }
    /**
     * The description of the job, which typically includes a multi-paragraph description of the company and related information. Separate fields are provided on the job object for responsibilities, qualifications, and other job characteristics. Use of these separate job fields is recommended. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 100,000.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the job, which typically includes a multi-paragraph description of the company and related information. Separate fields are provided on the job object for responsibilities, qualifications, and other job characteristics. Use of these separate job fields is recommended. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 100,000.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Optional. The employment type(s) of a job, for example, full time or part time.
     * 
     */
    @Export(name="employmentTypes", type=List.class, parameters={String.class})
    private Output<List<String>> employmentTypes;

    /**
     * @return Optional. The employment type(s) of a job, for example, full time or part time.
     * 
     */
    public Output<List<String>> employmentTypes() {
        return this.employmentTypes;
    }
    /**
     * Optional. A description of bonus, commission, and other compensation incentives associated with the job not including salary or pay. The maximum number of allowed characters is 10,000.
     * 
     */
    @Export(name="incentives", type=String.class, parameters={})
    private Output<String> incentives;

    /**
     * @return Optional. A description of bonus, commission, and other compensation incentives associated with the job not including salary or pay. The maximum number of allowed characters is 10,000.
     * 
     */
    public Output<String> incentives() {
        return this.incentives;
    }
    /**
     * Optional. The benefits included with the job.
     * 
     */
    @Export(name="jobBenefits", type=List.class, parameters={String.class})
    private Output<List<String>> jobBenefits;

    /**
     * @return Optional. The benefits included with the job.
     * 
     */
    public Output<List<String>> jobBenefits() {
        return this.jobBenefits;
    }
    /**
     * Optional. The end timestamp of the job. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    @Export(name="jobEndTime", type=String.class, parameters={})
    private Output<String> jobEndTime;

    /**
     * @return Optional. The end timestamp of the job. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    public Output<String> jobEndTime() {
        return this.jobEndTime;
    }
    /**
     * Optional. The experience level associated with the job, such as &#34;Entry Level&#34;.
     * 
     */
    @Export(name="jobLevel", type=String.class, parameters={})
    private Output<String> jobLevel;

    /**
     * @return Optional. The experience level associated with the job, such as &#34;Entry Level&#34;.
     * 
     */
    public Output<String> jobLevel() {
        return this.jobLevel;
    }
    /**
     * Optional. The start timestamp of the job in UTC time zone. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    @Export(name="jobStartTime", type=String.class, parameters={})
    private Output<String> jobStartTime;

    /**
     * @return Optional. The start timestamp of the job in UTC time zone. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    public Output<String> jobStartTime() {
        return this.jobStartTime;
    }
    /**
     * Optional. The language of the posting. This field is distinct from any requirements for fluency that are associated with the job. Language codes must be in BCP-47 format, such as &#34;en-US&#34; or &#34;sr-Latn&#34;. For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47){: class=&#34;external&#34; target=&#34;_blank&#34; }. If this field is unspecified and Job.description is present, detected language code based on Job.description is assigned, otherwise defaults to &#39;en_US&#39;.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output<String> languageCode;

    /**
     * @return Optional. The language of the posting. This field is distinct from any requirements for fluency that are associated with the job. Language codes must be in BCP-47 format, such as &#34;en-US&#34; or &#34;sr-Latn&#34;. For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47){: class=&#34;external&#34; target=&#34;_blank&#34; }. If this field is unspecified and Job.description is present, detected language code based on Job.description is assigned, otherwise defaults to &#39;en_US&#39;.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }
    /**
     * Required during job update. The resource name for the job. This is generated by the service when a job is created. The format is &#34;projects/{project_id}/jobs/{job_id}&#34;, for example, &#34;projects/api-test-project/jobs/1234&#34;. Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Required during job update. The resource name for the job. This is generated by the service when a job is created. The format is &#34;projects/{project_id}/jobs/{job_id}&#34;, for example, &#34;projects/api-test-project/jobs/1234&#34;. Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The timestamp when this job posting was created.
     * 
     */
    @Export(name="postingCreateTime", type=String.class, parameters={})
    private Output<String> postingCreateTime;

    /**
     * @return The timestamp when this job posting was created.
     * 
     */
    public Output<String> postingCreateTime() {
        return this.postingCreateTime;
    }
    /**
     * Optional but strongly recommended for the best service experience. The expiration timestamp of the job. After this timestamp, the job is marked as expired, and it no longer appears in search results. The expired job can&#39;t be deleted or listed by the DeleteJob and ListJobs APIs, but it can be retrieved with the GetJob API or updated with the UpdateJob API. An expired job can be updated and opened again by using a future expiration timestamp. Updating an expired job fails if there is another existing open job with same company_name, language_code and requisition_id. The expired jobs are retained in our system for 90 days. However, the overall expired job count cannot exceed 3 times the maximum of open jobs count over the past week, otherwise jobs with earlier expire time are cleaned first. Expired jobs are no longer accessible after they are cleaned out. Invalid timestamps are ignored, and treated as expire time not provided. Timestamp before the instant request is made is considered valid, the job will be treated as expired immediately. If this value is not provided at the time of job creation or is invalid, the job posting expires after 30 days from the job&#39;s creation time. For example, if the job was created on 2017/01/01 13:00AM UTC with an unspecified expiration date, the job expires after 2017/01/31 13:00AM UTC. If this value is not provided on job update, it depends on the field masks set by UpdateJobRequest.update_mask. If the field masks include expiry_time, or the masks are empty meaning that every field is updated, the job posting expires after 30 days from the job&#39;s last update time. Otherwise the expiration date isn&#39;t updated.
     * 
     */
    @Export(name="postingExpireTime", type=String.class, parameters={})
    private Output<String> postingExpireTime;

    /**
     * @return Optional but strongly recommended for the best service experience. The expiration timestamp of the job. After this timestamp, the job is marked as expired, and it no longer appears in search results. The expired job can&#39;t be deleted or listed by the DeleteJob and ListJobs APIs, but it can be retrieved with the GetJob API or updated with the UpdateJob API. An expired job can be updated and opened again by using a future expiration timestamp. Updating an expired job fails if there is another existing open job with same company_name, language_code and requisition_id. The expired jobs are retained in our system for 90 days. However, the overall expired job count cannot exceed 3 times the maximum of open jobs count over the past week, otherwise jobs with earlier expire time are cleaned first. Expired jobs are no longer accessible after they are cleaned out. Invalid timestamps are ignored, and treated as expire time not provided. Timestamp before the instant request is made is considered valid, the job will be treated as expired immediately. If this value is not provided at the time of job creation or is invalid, the job posting expires after 30 days from the job&#39;s creation time. For example, if the job was created on 2017/01/01 13:00AM UTC with an unspecified expiration date, the job expires after 2017/01/31 13:00AM UTC. If this value is not provided on job update, it depends on the field masks set by UpdateJobRequest.update_mask. If the field masks include expiry_time, or the masks are empty meaning that every field is updated, the job posting expires after 30 days from the job&#39;s last update time. Otherwise the expiration date isn&#39;t updated.
     * 
     */
    public Output<String> postingExpireTime() {
        return this.postingExpireTime;
    }
    /**
     * Optional. The timestamp this job posting was most recently published. The default value is the time the request arrives at the server. Invalid timestamps are ignored.
     * 
     */
    @Export(name="postingPublishTime", type=String.class, parameters={})
    private Output<String> postingPublishTime;

    /**
     * @return Optional. The timestamp this job posting was most recently published. The default value is the time the request arrives at the server. Invalid timestamps are ignored.
     * 
     */
    public Output<String> postingPublishTime() {
        return this.postingPublishTime;
    }
    /**
     * Optional. The job PostingRegion (for example, state, country) throughout which the job is available. If this field is set, a LocationFilter in a search query within the job region finds this job posting if an exact location match isn&#39;t specified. If this field is set to PostingRegion.NATION or PostingRegion.ADMINISTRATIVE_AREA, setting job Job.addresses to the same location level as this field is strongly recommended.
     * 
     */
    @Export(name="postingRegion", type=String.class, parameters={})
    private Output<String> postingRegion;

    /**
     * @return Optional. The job PostingRegion (for example, state, country) throughout which the job is available. If this field is set, a LocationFilter in a search query within the job region finds this job posting if an exact location match isn&#39;t specified. If this field is set to PostingRegion.NATION or PostingRegion.ADMINISTRATIVE_AREA, setting job Job.addresses to the same location level as this field is strongly recommended.
     * 
     */
    public Output<String> postingRegion() {
        return this.postingRegion;
    }
    /**
     * The timestamp when this job posting was last updated.
     * 
     */
    @Export(name="postingUpdateTime", type=String.class, parameters={})
    private Output<String> postingUpdateTime;

    /**
     * @return The timestamp when this job posting was last updated.
     * 
     */
    public Output<String> postingUpdateTime() {
        return this.postingUpdateTime;
    }
    /**
     * Optional. Options for job processing.
     * 
     */
    @Export(name="processingOptions", type=ProcessingOptionsResponse.class, parameters={})
    private Output<ProcessingOptionsResponse> processingOptions;

    /**
     * @return Optional. Options for job processing.
     * 
     */
    public Output<ProcessingOptionsResponse> processingOptions() {
        return this.processingOptions;
    }
    /**
     * Optional. A promotion value of the job, as determined by the client. The value determines the sort order of the jobs returned when searching for jobs using the featured jobs search call, with higher promotional values being returned first and ties being resolved by relevance sort. Only the jobs with a promotionValue &gt;0 are returned in a FEATURED_JOB_SEARCH. Default value is 0, and negative values are treated as 0.
     * 
     */
    @Export(name="promotionValue", type=Integer.class, parameters={})
    private Output<Integer> promotionValue;

    /**
     * @return Optional. A promotion value of the job, as determined by the client. The value determines the sort order of the jobs returned when searching for jobs using the featured jobs search call, with higher promotional values being returned first and ties being resolved by relevance sort. Only the jobs with a promotionValue &gt;0 are returned in a FEATURED_JOB_SEARCH. Default value is 0, and negative values are treated as 0.
     * 
     */
    public Output<Integer> promotionValue() {
        return this.promotionValue;
    }
    /**
     * Optional. A description of the qualifications required to perform the job. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    @Export(name="qualifications", type=String.class, parameters={})
    private Output<String> qualifications;

    /**
     * @return Optional. A description of the qualifications required to perform the job. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    public Output<String> qualifications() {
        return this.qualifications;
    }
    /**
     * The requisition ID, also referred to as the posting ID, assigned by the client to identify a job. This field is intended to be used by clients for client identification and tracking of postings. A job is not allowed to be created if there is another job with the same [company_name], language_code and requisition_id. The maximum number of allowed characters is 255.
     * 
     */
    @Export(name="requisitionId", type=String.class, parameters={})
    private Output<String> requisitionId;

    /**
     * @return The requisition ID, also referred to as the posting ID, assigned by the client to identify a job. This field is intended to be used by clients for client identification and tracking of postings. A job is not allowed to be created if there is another job with the same [company_name], language_code and requisition_id. The maximum number of allowed characters is 255.
     * 
     */
    public Output<String> requisitionId() {
        return this.requisitionId;
    }
    /**
     * Optional. A description of job responsibilities. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    @Export(name="responsibilities", type=String.class, parameters={})
    private Output<String> responsibilities;

    /**
     * @return Optional. A description of job responsibilities. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    public Output<String> responsibilities() {
        return this.responsibilities;
    }
    /**
     * The title of the job, such as &#34;Software Engineer&#34; The maximum number of allowed characters is 500.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return The title of the job, such as &#34;Software Engineer&#34; The maximum number of allowed characters is 500.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:jobs/v3:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:jobs/v3:Job", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
